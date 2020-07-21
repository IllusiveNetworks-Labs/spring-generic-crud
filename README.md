# spring-generic-crud
This is an example project for creating a generic CRUD with spring boot. The current implementation if using PostgreSQL.

# Usage
In application.properties, change the relevant data source properties and Start SpringGenericCrudApplication.
The schema will be created automatically.

1. creating a setting - 'curl -X POST -H "Content-Type: application/json" -d '{"data":"example"}' http://localhost:8080/setting'
2. get setting - 'curl --request GET http://localhost:8080/setting/{id}'
3. get all setting - 'curl --request GET http://localhost:8080/setting' 
4. update a setting - 'curl -X PUT -H "Content-Type: application/json" -d '{"data":"example2"}' http://localhost:8080/setting/{id}'
5. delete a setting - 'curl -X DELETE http://localhost:8080/setting/{id}'