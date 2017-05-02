# multi-tenacy
Multi-Tenacy with Spring 


Download the source code from git.
create DB schemas in mysql with  for exp:  tenant_1,tenant_2
create orders table in both schema.

CREATE TABLE orders (
id int not null auto_increment,
date datetime not null,
primary key(id)
);

You can run the application and create records in both database using postman with below rest api call.

method POST

http://localhost:8080/orders/tenant_1 

http://localhost:8080/orders/tenant_2

