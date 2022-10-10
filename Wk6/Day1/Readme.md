# Introduction to Spring
* When it comes to Spring it isn't necessary a single thing
* It is a big technology (so big) that they decided to section Spring into multiple things just to help organize the entire framework a bit better
* Ex:
    * Spring framework
    * Spring Boot
    * Spring data
    * and a lot more
* We will go more specifically on each section and what they specifically offer to us as a Java developer and when and why to use it

# Inversion of Control (IoC)
* What's the difference of a framework and a library?
    * A framework will dictate the control flow of your programming (essentially less control as it is being done for you and makes life just easier)
        * Ex: Javaline mostly since it setuped your embedded tomcat for you and also uses servlet under the hood and simplified the entire process to just adding a few methods and now you have a working api
            * This is not done so easily if you attempt to just use Servlets
    * A library gives you extra tools and functionalities to use but you still have to dictate the control flow
        * Ex: JDBC - It gave you a bunch of classes but you still have to do a lot of setting up
            - You have to have a connection service class so it knows where to connect
            - You have to specify when it should start connecting to the database and when to close that connection
            - You have to provide it SQL statements to execute on
            - You have to manually map what you get from the database to your Java objects
* A **design principle** in which we let a program or a container take care of any control flow for our app instead of the traditional way of doing it.
    * As you know, some objects will require other objects to make it really work like your Dao objects. What other objects did your dao needed to really work?
* Ex:
    * Let's say you have to drive to some destination. To apply IoC (the idea of it), what is an actual implementation we use in the real world that uses IoC? Uber, Tesla self driving, public transport.

## Dependency Injection (DI)
* Inversion of Control is just a concept hence we call it a design principle
* DI is the **design pattern** it implements IoC but specifically for our objects
* Since we are removing the control of making new objects, we should prevent ourselves to creating objects on our own
    * Ex: If we inverted the control of driving by using Uber, why the heck are you going to drive your own car and follow the uber driver?
* Benefits:
    * You can focus on creating functionality rather than trying to keep track of all the objects you are making.
        * Most common exception you guys probably seen in P1 was "NullReferenceException" well that is because you used a variable that didn't have an object
    * The program handling object creation will be optimize and efficient compared to what we can even hope to achieve
        * As with any robot or ai, they are just really good at doing what they are suppose to do. They still suck with adaptibility

## Spring IoC Container
* This is responsible for instantiating, managing, and assembling objects
* Any objects that came from the IoC container is now called **Spring Beans**