create table tol_question_supplement_info  (
   ref                  number(19)                      not null,
   question_id          number(19)                      not null,
   difficult            number(5),
   standard_time        number(19),
   c_time               date                           default sysdate not null,
   m_time               date                           default sysdate not null,
   constraint PK_TOL_QUESTION_SUPPLEMENT_INF primary key (ref),
   constraint AK_QUESTION_SUPP_QUESID unique (question_id)
);

comment on table tol_question_supplement_info is
'试题补充表 主要是保存经过大数据计算后的试题的难度及标准用时';

comment on column tol_question_supplement_info.ref is
'主键';

comment on column tol_question_supplement_info.question_id is
'试题id';

comment on column tol_question_supplement_info.difficult is
'试题难度';

comment on column tol_question_supplement_info.standard_time is
'标准用时（单位秒）';

comment on column tol_question_supplement_info.c_time is
'创建时间';

comment on column tol_question_supplement_info.m_time is
'修改时间';
