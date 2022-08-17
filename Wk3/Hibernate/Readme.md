# ORM
* Object-Relational Mapping is a tehcnique that lets you query and manipulate data from a database using an object-oriented paradign
* Essentially, we have SQL that understands tables and we have Java that understands objects. ORM helps translates/convert either tables to objects or objects to tables.

## Hibernate
* It is a framework that abstracts the majority of work needed to help transform our java objects into tables/rows and vice versa. 
* It uses your POJO classes to be mapped into a database table
    * NOTE: they decided to name it differently and called it **persistent classes** which just means they are the classes that hibernate will use to translate into a table

## How to create a persistence class?
* You must utilize Java Persistence API (JPA)
* It is not a tool or a framework but more of a set of concepts that can be used by any tool or framework
* You guess it, Hibernate uses JPA to help create persistent classes
* Note: Hibernate ORM is one of the most mature JPA implementations and also one of the popular ORMs in Java

## Note
* You don't need to know Hibernate for the curriculum. This is just to showcase you how to briefly use Hibernate to give you an idea how you can go about making your own Custom ORM.
* We will use the ORM functionality when Spring comes alone since they have their own ORM functionality with the same idea.
* Docker installation required for the upcoming demos - https://docs.docker.com/get-docker/
    * Installing Docker is... extensive especially if you are running on windows
    * 