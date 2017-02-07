create table TOL_NEWPAPER_DIR_ASSOCIATION  (
   ref                  NUMBER(19)                      not null,
   dir_id1              NUMBER(19)                      not null,
   dir_id2              NUMBER(19)                      not null,
   association          NUMBER(10,8)                    not null,
   c_time               date                           default sysdate not null,
   m_time               date                           default sysdate not null,
   cal_date             VARCHAR2(100)                   not null,
   constraint PK_TOL_NEWPAPER_DIR_ASSOCIATIO primary key (ref),
   constraint uk_dirid1_dirid2 unique (dir_id1, dir_id2),
   constraint uk_dirid1_dirid2_caldate unique (dir_id1, dir_id2, cal_date)
);

comment on table TOL_NEWPAPER_DIR_ASSOCIATION is
'学习目录间的关联系数';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.ref is
'主键';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.dir_id1 is
'学习目录1';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.dir_id2 is
'学习目录2';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.association is
'关联系数';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.c_time is
'创建时间';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.m_time is
'修改时间';

comment on column TOL_NEWPAPER_DIR_ASSOCIATION.cal_date is
'计算日期';
