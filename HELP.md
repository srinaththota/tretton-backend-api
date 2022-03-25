# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.tretton.assignment.tretton-backend-api' is invalid and this project uses 'com.tretton.assignment.trettonbackendapi' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

i)created database 
		1)docker run -d -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=trettondb -p 3306:3306 mysql5.7
		it will create the db instance ready
		2)create user table with columns username and password 

ii) created project with dependencies spring web(to create restful service) , spring security (to have authentication) , spring jpa(to connect db)
		
		
		to generate JWT token we use Authentication mechanism which validate user and generates token
		above token can be used to validate request recieved from user to various other microservices
		
		we get authentication in spring by AuthenticationManager.
		AuthenticationManager has authenticate() method which return successful authentication or it throws and exception with failure
		
		We use a Builder class called Authentication Manager 