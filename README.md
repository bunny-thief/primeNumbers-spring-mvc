![](primenumbers-mvc.png)

# primeNumbersApp

A Spring web application built with Spring Boot and Spring MVC, Thymeleaf and Bootstrap 5.

## Description

This is a reimplementation of the [primeNumbers-cli](https://github.com/jacques-navarro/primeNumbers-cli) application using the Spring Framework. It reuses the static methods inside of the PrimeNumbers library.

Instead of copying and pasting the code from inside the PrimeNumbers class, I thought it would be a good opportunity to learn how to package a Java application with Maven so it could be reused across multiple projects.  I then used what I learned during this process to create the blog post about installing a JAR file to the local Maven repository which can be read here at [jarFile passing(arguments)](https://www.passingarguments.dev/posts/java-jar-file/).

## Getting Started

### Dependencies

This application was compiled with Eclipse Temurin 17.0.8, Spring Framework 6.1.3 and Spring Boot 3.2.2.

This application has one dependency on the [primeNumbers library](https://github.com/jacques-navarro/primeNumbers). It needs to be installed to the Maven local repository. Simply, clone the library and then run the Maven install command.

```
git clone git@github.com:jacques-navarro/primeNumbers.git
```

cd into the project directory.

```
cd primeNumbers
```

Then run the install command to save it to the local Maven repository.

```
mvn clean install
```

Once that is taken care of, you should be able to run the primeNumbers-spring-mvc app locally.

### Execute Application

There are two options for running the application; clone the Github repo and compile the project or downloading the [**prime-numbers-mvc-0.0.1.jar**](https://github.com/jacques-navarro/primeNumbers-spring-mvc/blob/main/prime-numbers-mvc-0.0.1.jar "Prime Numbers MVC JAR").

**Important Note**: Both the above options require a JDK installed that is at least version 17.0.8 or above for the application to execute.

#### Clone Github Repo

Follow these steps to compile and run the application:
1. Clone the project.

```agsl
git clone git@github.com:jacques-navarro/prime-numbers-mvc.git
```
2. `cd` into the project directory.

```agsl
cd prime-numbers-mvc
```
3. Run the Maven clean and package commands to create the `JAR` file.

```agsl
mvn clean package
```

4. Run the application.

```agsl
java -jar prime-numbers-mvc-0.0.1.jar
```

#### Download JAR File

Alternatively, you can download the [**prime-numbers-mvc-0.0.1.jar**](https://github.com/jacques-navarro/primeNumbers-spring-mvc/blob/main/prime-numbers-mvc-0.0.1.jar "Prime Numbers MVC JAR") file from the root directory of this repo and run `java -jar prime-numbers-mvc-0.0.1.jar` in the location where it was saved.

## Author

![](Mastodon_logo.png) [@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.