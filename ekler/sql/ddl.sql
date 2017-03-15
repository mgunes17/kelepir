CREATE TABLE word (
	id int primary key,
	vocable varchar(70) NOT NULL,
	usage varchar(50) REFERENCES usage_type(type_name),
	record_date timestamp NOT NULL
);

CREATE TABLE meaning (
	id int primary key,
	word int REFERENCES word(id) NOT NULL,
	lexical_meaning varchar(200) NOT NULL,
	translation varchar(100)
);

CREATE TABLE example (
	id int primary key,
	meaning int REFERENCES meaning(id) NOT NULL,
	sentence varchar(150) NOT NULL,
	translation varchar(150)
);

CREATE TABLE usage_type (
	type_name varchar(50) primary key,
	abbreviation varchar(10) unique,
	translation varchar(50)
);
