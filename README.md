![](primenumbers-mvc.png)

# primeNumbersApp

A Spring web application built with Spring Boot and Spring MVC, Thymeleaf and Bootstrap 5.

## Description

This is a reimplementation of the [primeNumbers-cli](https://github.com/bunny-thief/primeNumbers-cli) application using the Spring Framework. It reuses the static methods inside of the PrimeNumbers library.

Instead of copying and pasting the code from inside the PrimeNumbers class, I thought it would be a good opportunity to learn how to package a Java application with Maven so it could be reused across multiple projects.  I then used what I learned during this process to create the blog post about installing a JAR file to the local Maven repository which can be read here at [jarFile passing(arguments)](https://www.passingarguments.dev/posts/java-jar-file/).

## Getting Started

### Dependencies

This application has one dependency on the [primeNumbers library](https://github.com/bunny-thief/primeNumbers). It needs to be installed to the Maven local repository. Simply, clone the library and then run the Maven install command.

```
git clone git@github.com:bunny-thief/primeNumbers.git
```

cd into the project directory.

```
cd primeNumberApp
```

Then run the install command to save it to the local Maven repository.

```
mvn install
```

Once that is taken care of, you should be able to run the primeNumbers-spring-mvc app locally.

The JAR file was compiled with Eclipse Temurin 17.0.8+7.

### Installing

The project can be distributed via the JAR file (primeNumberApp-1.0.jar) which is located in the project's base directory.

## Author

![](Mastodon_logo.png) [@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
