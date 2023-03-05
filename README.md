# Queary_anootations
Apply various Queries
# Jpa-Queries

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.9/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.9/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.9/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.9/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.9/reference/htmlsingle/#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

# Operations

* post/create student :http://localhost:8080/savestudent
* get Student using varuious queries :http://localhost:8080/getStudent
  
* using request param for perform various quaries for get student ex age, first_name , last_name

#  Flow

* request from postman come to the cotroller class  and based on end point and request parame method in controller is perform and  from controller method in service class has been called. in service class we autowire the studentrepository interface which extebds JPAREPOSITOry which save data in database

# datastructure  and database used in project
* List
* sql

# summary
* In this project we normally do jpa querye(query by methods and native queries) with JPA Query KeyWords.

