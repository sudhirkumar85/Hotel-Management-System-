Create database cws;
use cws;
CREATE TABLE USERS (USERID VARCHAR(50) PRIMARY KEY, PASSWORD VARCHAR(30),
NAME VARCHAR(40), EMAIL VARCHAR(40));

Create table customer (
billid int primary key auto_increment ,  name varchar(35), mobile varchar(30),email varchar(30),date varchar(30),nationality varchar(30),
gender varchar(30),id varchar(30),address varchar(100),roomnumber varchar(30),bed varchar(30),roomtype varchar(30),
price double, status varchar(30),outdate varchar(35),days int ,amount double
);

create table room (roomnumber int,roomtype varchar(34),bed varchar(35),price double,status varchar(35)
);