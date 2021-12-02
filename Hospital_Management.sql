create schema HMS;
use hms;
create table register(
  id int primary key,
  firstname varchar(30) not null,
  middlename varchar(30) not null,
  lastname varchar(30) not null,
  username varchar(45) not null,
  password varchar(30) not null
  );
  alter table register modify id int auto_increment;
  alter table register add unique key(username);
  show tables from hms;
  select *from register;
  truncate table register;
  select*from register where username='mahesh_z'and password='mahesh@123';
  insert into register(id,firstname,middlename,lastname,username,password)values(1,'Mahesh','Shantaram','Zalte','mahesh_z','mahesh@123');
  insert into register(firstname,middlename,lastname,username,password)values('Mahesh2','Shantaram','Zalte','mahesh_z1','mahesh@1234');
  
  create table addpatientrecord(
     pid int primary key auto_increment,
     name varchar(100) not null,
     contact bigint not null,
     age int not null,
     gender varchar(10) not null,
     bloodgp varchar(5) not null,
     address varchar(50) not null,
     anymajor varchar(20) not null
     );
select *from addpatientrecord;

create table adddiagnosisinfo(
     pid int primary key auto_increment,
     symptons varchar(100) not null,
     diagnosis varchar(100) not null,
     medicine varchar(100) not null,
     ward_required varchar(10) not null,
     type__ward varchar(10) not null
     );
 alter table adddiagnosisinfo add foreign key(pid) references addpatientrecord(pid);
 
 select * from adddiagnosisinfo;
 INSERT INTO `hms`.`adddiagnosisinfo` (`pid`, `symptons`, `diagnosis`, `medicine`, `ward_required`, `type__ward`) VALUES ('11', 'body pain', 'Xray', 'nbdhsgs', 'Yes', 'single');
 select addpatientrecord.pid,name,contact,age,gender,bloodgp,address,anymajor,symptons,diagnosis,medicine,ward_required,type__ward from addpatientrecord inner join adddiagnosisinfo on addpatientrecord.pid = adddiagnosisinfo.pid;

     