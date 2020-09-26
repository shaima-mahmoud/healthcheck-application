# JAVA healthcheck-application 
A spring boot rest application built with Gradle.
The project source code and build files are committed to the public gitHub repository: https://github.com/shaima-mahmoud/healthcheck-application

Build folder wasn't supposed to be commited to the GitHub beside the source code.
It should've been built using a CI tool somewhere on a server then to be downloaded to the docker container.

And when running the project, the repository should be cloned and then we should navigate to the project folder to start bulding the images.

The project container starts from docker-compose.yml file that builds 2 images subsequently,
the Data base image from the script folder from the given git repository and the healthcheck-application.

All steps are listed in the build instructions.

The code is covered by unit test for the controller methods only, no service classes or DAO classes unit test.
I could cover the OK, NOT_FOUND status, but not the SERVER_ERROR status.

## Project Frameworks
* Java 8+
* Gradle 4+
* Docker

## Test Frameworks
* JUnit

## Build Instructions
	Linus shell: 
	
	git clone https://github.com/shaima-mahmoud/healthcheck-application
	cd healthcheck-application
	sudo docker-compose up --build
	
	curl http://0.0.0.0:8080/AFG
	Or
	open web browser and try: http://0.0.0.0:8080/EGY to get country data
	http://0.0.0.0:8080/EGYPT to get INVALID_COUNTRY_CODE

## Import instructions
To run the project,
1. git clone the repository
2. now cd to the project folder healthcheck-application
3. Now you can run the docker-compose command that builds the data base image then the Docker file that runs the application jar file

## Required Tools
Please note that, all tools should be pre installed on the host.

* Linux OS
* Docker
