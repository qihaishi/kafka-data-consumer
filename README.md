# Kafka 回写到oracle

#注意事项
1. 若表名以单字母开头加_,则在生成Mapper以后,需要显示的设置Mapper的beanName,
   若不指定,默认为该单字母大写
   如:
   @Component("jMaterialNodeInfoDelMapper")
   public interface JMaterialNodeInfoDelMapper
2. c_time , c_user_id , m_time, m_user_id 等以单字母_开头的变量,在反射注入实体方法时需处理为setcTime等