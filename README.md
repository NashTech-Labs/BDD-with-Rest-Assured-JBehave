# BDD-with-Rest-Assured-JBehave

This template consist of a BDD(Behavior-driven development) framework with Rest-Assured. The BDD tool that we'll be using is JBehave, as it is very much compatible with JAVA projects. On top of this, we can generate Allure report for the test written in the story file.

## Steps for Execution.

1. Clone the repository

`git clone https://github.com/knoldus/BDD-with-Rest-Assured-JBehave.git`

2. Move into the directory and execute the following command:-

`mvn clean -Dtest=DemoStory test`

3. To generate the allure report, run

`mvn allure:report`

## Technologies used

**Programming Language** - JAVA, Gherkins

**Build tool** - Maven

**Automation tool** - Rest Assured

**BDD Tool** - JBehave

**IDE** - Intellij

## Dependecies Used

**Rest Assured**
```
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>4.4.0</version>
            <scope>test</scope>
        </dependency>
```

**JSON-Simple**

```
        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
        </dependency>
```

**JBehave**
```
        <dependency>
            <groupId>org.jbehave</groupId>
            <artifactId>jbehave-core</artifactId>
            <version>4.1</version>
            <scope>test</scope>
        </dependency>
```

**Allure-JBehave-Reported**
```
        <dependency>
            <groupId>io.tapack</groupId>
            <artifactId>allure-jbehave-reporter</artifactId>
            <version>0.1</version>
        </dependency>
```

## Plugin Used

**Allure Maven Plugin**
```
    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>io.qameta.allure</groupId>
                    <artifactId>allure-maven</artifactId>
                    <version>2.10.0</version>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
```
 
For a better understanding, please refer to the blog:-
https://blog.knoldus.com/rest-assured-jbehave-and-allure-a-happy-marriage/
