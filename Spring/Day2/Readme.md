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

# Lombok
* The aim for lombok java library is to make life easier as a developer when generating boilerplate code
    - boilerplate code is just extra syntaxes that you have to repeat multiple times
    - Ex: your setters and getters, constructors, toString() methods, etc.
* Lombok will generate those extra code for you with ease
* @Getter - generates getters for your model
* @Setter - generates setters for your model
* @NoArgsConstructor - makes a constructor with no parameters
* @ToString - overrides and creates a toString() method
* @EqualAndHashCode - overrides and creates equals method and hashcode method
* @Data - for models, it will generate both setter, getter, equals, hashcode, and toString for you

# Spring Boot
* The easiest way to create a project and what 95% of tutorials you see out there uses
* It is created to abstract almost all configuration required to get started and it is almost as simple as just creating the project and running it
* Remember the configuration we need to have spring framework work? We have to create the IoC container, specify the beans, and sometimes also specify what are the dependencies of a bean is required 
* This still uses Spring framework ofc just under the hood
* The main goal of Spring boot are:
    * Absolutely no code generation and no requirements for XML configuration (YAY)
    * Make an enterprise grade level project out of the box

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
* @Entity - Declares the class to be mapped into a database table
* @Id - makes a primary key out of that field
* @OnetoMany, @ManytoOne, @ManytoMany, @OnetoOne - configures SQL multiplicity

# Spring Web MVC
* It is a specific section of Spring that is all about serving a web application.
* We will focus mostly on Controller, what you will be interfacing with mostly
    * Since Spring data handles models and database for you
- `@Controller`

  - A Spring stereotype annotation that is put at the class level for a presentation-layer class whose methods expose web endpoints.

- `@RestController`
  - Used when creating RESTful APIs using Spring MVC
  - An aggregate annotation that implies `@Controller` on the class level and `@ResponseBody` on each controller method

- `@RequestMapping`

  - Used to expose a resource through a web endpoint
  - Does not specify a specific HTTP verb by default
  - `method` value can be provided to indicate a HTTP verb

- `@GetMapping`

  - Used to expose a resource through a web endpoint specific to HTTP GET requests

- `@PostMapping`

  - Used to expose a resource through a web endpoint specific to HTTP POST requests

- `@PutMapping`

  - Used to expose a resource through a web endpoint specific to HTTP PUT requests

- `@DeleteMapping`

  - Used to expose a resource through a web endpoint specific to HTTP DELETE requests

- `@PathVariable`

  - Used to grab a variable that is a part of the URI path

- `@RequestParam`

  - Used to grab a variable that is defined as a query parameter within the URI

- `@RequestBody`

  - Used to grab a object from the body of the web request

- `@ResponseBody`

  - Used to indicate that the returned value of the controller method will be placed within the body of the web response

- `@ResponseStatus`

  - Used to indicate the HTTP response status code for a controller method

- `@ExceptionHandler`

  - Used to send custom responses back to the client when a controller method throws a specified exception