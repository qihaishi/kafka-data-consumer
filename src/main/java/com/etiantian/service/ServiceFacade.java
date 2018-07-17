package com.etiantian.service;

import com.etiantian.launcher.SpringContext;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by yuchunfan on 2017/2/6.
 */
@Service
public class ServiceFacade {

    public static final String UNDERLINE = "_";
    private static Logger logger = Logger.getLogger(ServiceFacade.class);

    /**
     * 将带下划线的字符串转换成驼峰形式
     *
     * @param str 字符串
     * @return
     */
    public static String underlineToCamel(String str) {
        if (str == null || "".equals(str.trim())) {
            return "";
        }
        int len = str.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == '_') {
                if (++i < len) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 将字符串首字母大写
     *
     * @param str 字符串
     * @return
     */
    public static String toFirstUpperCase(String str) {
        return str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toUpperCase());
    }

    /**
     * 根据约定的规则设置设置参数
     * {
     * "query": {
     * "colum1": "23",
     * "column2": "324"
     * },
     * "update": {
     * "column3": "ffw"
     * }
     * }
     *
     * @param t    实体类
     * @param json
     * @param <T>
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static <T> void setParamsByRulesJson(T t, JSONObject json,boolean filterCime) throws Exception {
        if (json.has("query")) {
            setParamsByJson(t, (JSONObject) json.get("query"),false);
        }
        if (json.has("update")) {
            setParamsByJson(t, (JSONObject) json.get("update"),filterCime);
        }
    }

    public static <T> boolean setExampleByJson(T t, JSONObject json) throws Exception {
        if (!json.has("query")) {
            return false;
        }

        Object criteria = t.getClass().getMethod("createCriteria", null).invoke(t, null);
        JSONObject queryJson = (JSONObject) json.get("query");
        Iterator<String> it = queryJson.keys();
        while (it.hasNext()) {
            String key = it.next();
            Object value = queryJson.get(key);
            String methodName = "and" + toFirstUpperCase(underlineToCamel(key)) + "EqualTo";
            callMethod(criteria, methodName, value);
        }

        return true;
    }

    public static <T> void setParamsByJson(T t, JSONObject json,boolean filterCtime) throws Exception {
        Iterator<String> it = json.keys();
        while (it.hasNext()) {
            String key = it.next();
            if(filterCtime && (key.equalsIgnoreCase("c_time") || key.equalsIgnoreCase("ctime"))){
                continue;
            }
            Object value = json.get(key);
            timeOperate(t, key, value);
        }
    }

    public static <T> void setUniqueKeyByJson(T t, JSONObject json) {

    }

    public static <T> Object callMethod(T t, String methodName, Object... params) throws Exception {
        Object rtn = null;
        Method[] methods = t.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class<?>[] types = method.getParameterTypes();
                if (types != null && types.length > 0 && params != null && params.length > 0) {
                    int index = 0;
                    for (Object param : params) {
                        if (!types[index].getSimpleName().toLowerCase().equals("string")
                                && !types[index].getSimpleName().toLowerCase().equals("date")) {
                            param = ConvertUtils.convert(param, types[index]);
                        } else if (types[index].getSimpleName().toLowerCase().equals("string")) {
                            param = param.toString().replace("&apos;", "'");
                        } else if (types[index].getSimpleName().toLowerCase().equals("date")) {
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            param = sdf.parse(param.toString());
                        }
                        params[index] = param;
                        index++;
                    }
                    rtn = method.invoke(t, params);
                    break;
                }
            }
        }
        return rtn;
    }

    /**
     * setCUserId
     *
     * @param t
     * @param key
     * @param value
     * @param <T>
     * @throws Exception
     */
    static <T> void timeOperate(T t, String key, Object value) throws Exception {

        if (!StringUtils.isEmpty(key)) {
            String methodName;
            boolean bool = notNeedConvert(key);
            if(bool){
                methodName = "set" + underlineToCamel(key);
            }else{
                methodName = "set" + toFirstUpperCase(underlineToCamel(key));
            }
            callMethod(t, methodName, value);
        }
    }

    /**
     cTime
     c_
     * @param key
     * @return
     */
    private static boolean notNeedConvert(String key) {
        String secondStr = key.substring(1, 2);
        char c = key.charAt(1);
        boolean isUpper = c >= 65 && c <= 90;
        if (secondStr.equals(UNDERLINE) || isUpper) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("92044".hashCode() % 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd  HH:mm:ss");
        Date parse = null;
        try {
            parse = simpleDateFormat.parse("2003-9-5 14:26:00");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public void doService(String topicName, JSONObject json) {
        try {
            topicName = topicName.toLowerCase();
            // get service object
            String mapperName = underlineToCamel(topicName) + "Mapper";
            String mapperClassName = "com.etiantian.dao.mappers." + toFirstUpperCase(mapperName);
            Class mapperClazz = Class.forName(mapperClassName);
            Object mapper = SpringContext.getBean(mapperName, mapperClazz);

            // get entity obj
            String entityName = underlineToCamel(topicName);
            String entityClassName = "com.etiantian.entity." + toFirstUpperCase(entityName);
            Class entityClazz = Class.forName(entityClassName);
            Object entity = entityClazz.newInstance();
            setParamsByRulesJson(entity, json,false);

            // get example obj
            String exampleClassName = entityClassName + "Example";
            Class exampleClazz = Class.forName(exampleClassName);
            Object example = exampleClazz.newInstance();
            setExampleByJson(example, json);

            if (json.has("query")) {
                int affectRows = (Integer) callMethod(mapper, "updateByExampleSelective", entity, example);
                if (affectRows < 1) {
                    callMethod(mapper, "insertSelective", entity);
                }
            } else {
                callMethod(mapper, "insertSelective", entity);
            }
        } catch (Exception e) {
            logger.error("doService ERROR!!\n", e);
        }
    }
}
