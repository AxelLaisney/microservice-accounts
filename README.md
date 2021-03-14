MICROSERVICE-ACCOUNTS

A microservice made with Spring framework used to return and interact with account information like the balance, rate,etc...
The microservice is running along the user microservice

PROJECT STRUCTURE

-src/main/java/fr/java/spring/microservice/microserviceaccounts/model
containt the classes that describe database tables models

accounts
containt the controllers of the project

-src/main/java/fr/java/spring/microservice/microserviceaccounts/dao
contain the repository classes that manage CRUD operations.

-application.yml
define the application configurations

PROJECT FONCTIONNALITIES
The project allows to return all accounts or a specific account if an id is given,
also being able to add accounts and delete them.

BUILD WITH
Visual studio code - The IDE
Java Spring - The framework
Maven - Dependency management
lombok - java librairy for the editor
MySql connector - MySql driver to connect to the database

VERSIONING
1.0.0