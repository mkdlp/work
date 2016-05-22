select * from user



--用户表
create table vusers(
	userId  varchar2(20) primary key,   --用户编号
	userName varchar2(20) not null,     --用户姓名
	password varchar2(20) not null,     --用户密码
	version  int,                   --用户是否有效
	status int default 1      --用户角色  1.普通用户  2.	管理员
);
select * from vusers;
select userId,userName,password from vusers where userId='qyb' and password='a'
--投票主题表
create table subject(
	sid int primary key,    --主题编号 
	userName varchar2(20),    --用户名
	title varchar2(100) not null,   --标题
	type int default 1,      --类型
	version  int                   --主题是否有效
);
drop table subject;
create sequence subject_sid;
select * from SUBJECT;
select count(oid) from options where sid=22
insert into subject values(subject_sid.nextval,'ds','dsada',1,1);
insert into subject values(subject_sid.nextval,'weq','dsada',1,1);
select max(sid) from SUBJECT;

 
--主题下的选项表
create table options(
	oid int primary key,    --选项编号
	sid int
		constraint FK_options_subject_sid references subject(sid),
	name varchar2(20) not null, --选项名
	orders int                --显示顺序
);

drop table options
select count(title) onum from options where title='中国的首都是？'
select * from options
create sequence subject_oid;
select sid,title from subject
--用户的选项表
create table item(
	iid int primary key,     --编号
	sid int
		constraint FK_item_subject_sid references subject(sid),  --主题编号
	oid int
		constraint FK_item_options_oid references options(oid),  --选项编号
	userId varchar2(20)     --用户姓名
		constraint FK_item_vusers_userId references vusers(userId)
);
select *from item
select count(oid) from item where oid=21
select count(sid) from item where sid=41
drop table item
create sequence item_iid;
select count(*) from item where sid=22
select count(distinct userName) num from item group by sid,userName;