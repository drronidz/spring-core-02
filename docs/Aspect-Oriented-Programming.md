##Aspect Oriented Programming

### What is AOP?

* AOP - Aspect Oriented Programming.
* Allows developers to add behavior to code, without modifying existing code.


### AOP Terminology

* Aspect : "A modularization of a concern that cuts across multiple classes".
   * example: **A module** : (A logging module).
* Join Point : A point of execution in the program to connect the Aspect.
   * In Spring this is always a method.
* Advice : Action taken by an aspect to join point.
   * What the Aspect does.
* Pointcut : One or more join points where advice should be executed.
* Introduction : Allows you to declare new properties/methods on a target object.
   * Kind of like meta programming in Groovy.
* Target Object : the object being advised by one or more aspects.
* AOP Proxy : The proxy object created by the AOP framework.
   * Wraps the target object.
* Weaving : "Weaving is the process of linking aspects with other application types or objects to create
an advised object. This can be done at compile time, load time, or at runtime".

### Types of Advice

* Before : before method execution.
* After : after method execution.
* After-returning: Run advice after method execution, only if method completes successfully.
* After-throwing: Advice to run upon an exception.
* Around: Run Advice before and after a method invoke.

### AOP Implementation in Spring

* **XML Schema Based** : Configuration is done in a Spring XML configuration file.
* **@AspectJ Based** : Using AspectJ annotations.

### AOP in Spring Boot

* By default, AOP Auto-configuration is enabled in Spring boot.
   * This is the same as using a Spring Java Configuration class to enable AspectJ Auto Proxy.