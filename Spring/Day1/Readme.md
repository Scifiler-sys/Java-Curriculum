# Introduction to Spring
* When it comes to Spring it isn't necessary a single thing
* It is a big technology (so big) that they decided to section Spring into multiple things just to help organize the entire framework a bit better
* Essentially, based on what the developer needs, they can pick and choose what to add. Also, helps lessen the amount of "meat" or space your app requires to run. 
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

# Spring IoC Container
* This is responsible for instantiating, managing, and assembling objects
* Any objects that came from the IoC container is now called **Spring Beans**
* Basically they are special objects that is handled by Spring. We now have little control of how objects are created in Spring.
## Bean Scope
* Singleton
    * By default, all beans are created as singleton
* Prototype
    * It will instantiate an object every time you request that same bean from the container
    * Very useful for stateful objects
* Web Aware Scopes
    * 4 more scopes that are specializes with web application
    * You are less likely to used these 4 scopes and knowing them for the most part is a plus.
    * Request Scope - a new bean is created for each unique http requests
    * Session Scope - a new bean is created for one http session
    * Application & WebSocket scope
        * Application scope - a new bean will follow the ServletContext lifecycle
        * WebSocket scope - A new bean is created for one websocket session

## Lifecycle of a Bean
* Essentially looking at how a Bean lives and dies in a Spring framework
* Main idea is sometimes you want to do a special behavior the moment a specific Bean lives or dies
    * Knowing the lifecycle of a bean and its hooks is the way to do it
* A Bean being born:
    1. The object is instantiated using a constructor
    2. Dependencies are handled
    3. Spring gives the bean a new name
    4. Custom initialization method is run (The first lifecycle hook we as devs can mess with)
    5. Spring Bean is ready to use
* A bean being killed:
    6. IoC will mark the bean as "no longer is used"
    7. Spring will run the destroy method (Another lifecycle hook we as devs can mess with)
    8. Garbage collection coming in to collect its life as the grim reaper

## ApplicationContext vs BeanFactory
* Spring comes with two IoC containers that you can choose from
* The general rule is ApplicationContext has way more features than BeanFactory
    * Mostly because ApplicationContext inherits everything what the BeanFactory has
* Only reason to use BeanFactory over ApplicationContext is where memory consumption is extremely critical that a few kilobytes of memory will make a huge difference

**`BeanFactory` features:**
- Lazily instantiate beans (Will only create the object if you need it)
- Requires beans.xml to configure

**`ApplicationContext` features:**
- Has everything BeanFactory has
- Eagerly instantiates beans (It will create an object of the bean the moment you start the IoC)
- **Provides Support For Annotation Configuring**

## XML-based configuration
* Utilizes a `beans.xml` file
* Useful if you want a centralize information to have all your Bean configuration at
* The older way of configuring Beans

## Annotation-based configuration
* It will heavily use annotation to declare and configure Beans
* @Component - declares the class to be targeted by Spring so it can make a Bean out of it
* @Scope - declares the scope of the Bean
* @Autowire
    * Can be attached to a setter, field, or constructor
    * It will inject a Bean into the setter, field, or constructor
    * The Bean have to exist to work
* @Qualifier
    * Does the same thing as @Autowire
    * Needs one parameter that asks for the bean's name that it wants to inject
    * So basically the more manual way compared to Autowire
* @Bean
    * Does the same thing as @Component
    * A more manual way to create a Bean by supplying your own creation logic
    * Must be used within a AppConfig class w/ @Configuration
* @Configuration - declares the class to work the same as our beans.xml but in class format