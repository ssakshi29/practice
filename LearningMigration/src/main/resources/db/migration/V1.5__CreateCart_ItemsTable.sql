create table cart_items(
id int not null,
cart_id int,
product_id int,
quantity int,
PRIMARY KEY (id)
);
