# Number Sequence Generator
.

## Design Conventions
* Uses Java8 streams API lazy sequences and SpringBoot 2 for REST implementation.
* Choice of build tool is Maven because of first class IDE support.
* Application has a context path NumberSequence and runs on port 5000. Incase of Docker, it has to be mapped to host port. 
* A Domain Driven design with multilayered architecture.
* Application is containerized, can be run using docker.
* Uses spotify docker plugin to build docker image as part of maven life cycle.

## Build and Run
* mvn clean package && mvn spring-boot:run or java -jar target/target/NumberSequence.jar or mvn exec:java -Dexec.mainClass="org.math.numbers.NumberSequenceGeneratorApplication"
* docker run -p 8080:5000 hariharank12/numbersequence:1.0-SNAPSHOT

## Endpoints and sample responses
* Get all orders - GET http://localhost:5000/NumberSequence/numbers

######RESPONSE
```
{
data: [
9,
25,
36,
81,
100,
144,
225,
324,
400,
441
],
time_taken in nano seconds: 4000000,
time_taken in milli seconds: 4
}
```

