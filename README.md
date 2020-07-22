# spring-generic-crud
This is an example project for creating a generic CRUD with spring boot. That is, 
a generic structure of controllers, services and data layers that can be used with different entities. 
This can reduce the time it takes to write a new CRUD, it eliminates code duplication and unit tests can be written 
only for the generic layers.      
The current implementation is using PostgreSQL.

# Usage
In application.properties, change the relevant data source properties and Start SpringGenericCrudApplication.
The schema will be created automatically.

1. creating a setting - 'curl -X POST -H "Content-Type: application/json" -d '{"data":"example"}' http://localhost:8080/setting'
2. get setting - 'curl --request GET http://localhost:8080/setting/{id}'
3. get all setting - 'curl --request GET http://localhost:8080/setting' 
4. update a setting - 'curl -X PUT -H "Content-Type: application/json" -d '{"data":"example2"}' http://localhost:8080/setting/{id}'
5. delete a setting - 'curl -X DELETE http://localhost:8080/setting/{id}'