#Jacoco Maven Multi Module Configuration

This project contains a minimal configuration for JaCoCo report aggregator em Java.

- report-aggregate
    - module-1
    - module-2
    - module-3
    - jacoco-report-aggregator


## Install

``` mvn clean install -U #reports will be generate at jacoco-report-aggregator/target/site folder```

## Working with Sonar

```
# start local sonar 
docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
# afterwards run mvn verify
mvn --batch-mode verify sonar:sonar -Drevision=local-test
```


## Contribution Guide

// TODO


## Future Updates

// Submodules of submodules aggregator
// Packing all this configuration in a maven plugin to avoid all this work/config stuffs in future projects.