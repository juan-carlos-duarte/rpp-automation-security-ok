Autumn  :rpp-automation-securitys-secospi
===

Overview
--
Replace with your automation project goal...

Requirements
--

- Gradle
- Maven
- Java 8+
- [Lombok](https://projectlombok.org/)



Build
--

2. Setup Gradle, run the following command in the project path 
```shell
gradle wrapper --gradle-version=6.8 
```


2. Build artifact
```shell
gradlew clean build
```

1. Publish the artifact to maven local
```shell
gradlew clean build publishToMavenLocal
```


CI/CD
--

Open `automation.properties` and replace the value of the bellow properties:

- `automation.url`= set your api gateway endpoint, example https://automation.com/rpp-auto-gateway-api
- `automation.bitbucket`= replace default value with your git repository url, example: git@bitbucket.org:rappinc/dummy.git

How to Install
---
This automation project works with the [Autumn Project](https://github.com/rappiinc/autumn), please checkout the [onboarding documentation](https://github.com/rappiinc/autumn/wiki/Starting-build-automation-scripts-on-Autumn).

Author
--

- replace with your name & email

This project was generated using  **Autumn ShoPay scaffolding generator**