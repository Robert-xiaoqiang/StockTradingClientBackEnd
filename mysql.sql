
use stocksystem;

create table fund_security(
	fund_id varchar(255) primary key,/*资金账户id*/
    security_id varchar(255) not null/*证券账户id*/
);

create table security_stock(
	id integer auto_increment primary key, /*自增长主键、没用*/
    security_id varchar(255) not null,/*证券账户id*/
    stock_id varchar(255) not null,/*股票id*/
    ava_price decimal(10, 5),/*平均持有价格*/
    num integer/*持有数量*/
);

create table record (
     record_id int auto_increment primary key,
     fund_id varchar(255),
     stock_id varchar(255),
     buy tinyint(1),
     amount int(15),
     record_timestamp varchar(255),
     price decimal(10, 5),
     state tinyint(1)
);

insert into record values(1,'111','123456',0,10000,2019060819270808,20.12,1);
