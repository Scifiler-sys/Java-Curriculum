# Stereotypes
* Different ways to tell Spring what type of Bean is this
1. @Component
    * Generic stereotype
    * Will let Spring create a bean out of the class
    * Will also allow it to be injected into other beans
2. @Repository
    * Used for classes that interacts with the database
3. @Service
    * Used for service layer
4. @Controller
    * Used for controller layer
    * Allows you to utilize multiple extra annotations specifically for a controller

# What's an ORM?
* Stands for Object Relational Mapper
* The whole point is to simplify the transition from a database to a Java object
* It will create SQL queries for you, it will map the info coming in from the database into a Java object for you, it will handle connection for you, and so on.
* An ORM will map information from the database to Java object and vice versa. 

# Spring Data
* It is a specific section of Spring that is all about database communication
* It gives you several tools to interact with a data source and also several choices to which one you want to utilize
    * Java has a bunch of frameworks that interacts with a database, Spring collected the most popular and put it all together

## Spring Data JPA
* JPA stands for Java Persistance API
* This API came from Java EE 6 but Spring made their own version of it
* Essentially it will have pre-made classes and interfaces that will make constructing a class that interacts with a database seamless
* Needs `application.yml` file to know what database to connect to and what type of database engine it uses
### Spring JPA Repository
* Has important annotations to help Spring data map your Java object properly into SQL table
* Comes from javax.persistence package