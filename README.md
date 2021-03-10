# purchaseSpringBoot
Added Below:
Purchase - 
getAll Items,
update Item,
Delete Item,
Add Item
Swagger UI
only added on pom.xml
------------------------
<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.5.2</version>
		</dependency>
-----------------------------
and 

MySql DB - 
server.port=9988
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/home
spring.datasource.username=root
spring.datasource.password=admin

http://localhost:9988/swagger-ui.html
