# Introduction to Microservice
## Monolithic Architecture
* Both the backend and frontend is tightly coupled
* Easy to get it up and running and deployed
* Mostly used for small projects and prototypes
* Very hard to scale

## Service Oriented Architecture
* The architecture style of breaking up your application into services
* Decoupled the frontend and backend
* Easier to scale and develop into complex projects

## Micro Service Architecture
* Breaks down services even more
* It wants each service to be responsible for one thing only
* Starting this architecture and creating a supporting infrastructure for it is very complex, but once everything is setup, developing and scaling your poject will be easy
* Very popular architecture style used by big IT companies

## Characteristics of MSA
1. Single Responsiblity Principe
    * Once service must be responsible for one thing
2. Encapsulated
    * Each service must encapsulate the data and behavior as a single unit
    * Data for a service must be private and can only be seen by its service
    * TLDR: we make a database for each service to utilize
3. Independent
    * A service is independent from other services
    * Meaning if a service went down, all of your other service can function normally with no problem
    * Best part, each service can be created with a totally different language

## Advantages
1. Scalability   
    * You can have individual teams responsible for one service to work on
2. Simplicity of developing new features
    * Once the infastructure is setup
    * Adding new feature to a service is easier because it will not affect the other team's service
3. Deployment of individual services
    * Each service can deploy (or publish) its new features
4. Fault Tolerant
    * One service going down doesn't mean your entire backend will fail
5. Language Agnostic
    * You can use whatever language you want to create each service 
6. Testable
    * You can test each individual service to see if that one is functional

## Disadvantages
1. Deployment of the whole entire environment
    * There might be big updates that affects everything that require the entire MSA to re-deploy
    * This will take a lot of time
2. Complexity when it comes to communication
    * With a lot of "moving parts" communication becomes a major issue
    * You will see a lot of the "tools" given to us to implement MSA is to just handle the communication
3. Monitoring
    * You have multiple services to keep checking on to ensure that they are working properly
    * It might take time to find an issue with a service

## Key things to help implement MSA
1. Service Discovery
    * It is like a phone book but services
    * This will have the information for the location of the service and as well as its purpose
    * It also has an automatic process to keep checking on each service to ensure it is working properly
2. Gateways
    * They are responsible for helping the services communicate with each other
    * Also simplifies the life of a client that is interacting with this backend
    * It abstracts the entire MSA ecosystem and make it seems like it is one big backend
3. Load balancing
    * They balance the load of incoming network traffic for your services
    * It is like what you do whenever you have a team project, one person has to do one task and you effectively became a task balancer
4. Circuit Breaker
    * Very similar behavior as what your circuit breaker does in your apartment/home electric system
    * In the event that something fails, it will ensure that the failure will be isolated to that service and not affect other service
