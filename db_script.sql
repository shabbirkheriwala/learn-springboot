CREATE TABLE `user` (
	`user_id` int(11) NOT NULL AUTO_INCREMENT,
	`name` varchar(255) NOT NULL,
	`last_name` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`password` varchar(255) NOT NULL,
	PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into user (name,last_name,email,password) values ('shabs','kheriwala','shabs@abc.com', 'password');
insert into user (name,last_name,email,password) values ('test','test','test@abc.com', 'password');

insert into employee(fname,lname) values ('Shabbir', 'Kherywala');