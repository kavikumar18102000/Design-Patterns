**Factory Design Factory**

Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

* It abstracts the object creation process.
* Helps in creating objects without exposing the instantiation logic to the client.
* The client only interacts with the common interface, not the concrete class.

**Problem**

You are building a food delivery app where users can order different dishes like Pizza, Burger or Pasta. Instead of creating food items directly using 'new', we delegate the creation logic to factories.

**Benefits**

* Follows Open/Closed Principle(OCP)
* Removes object creation logic from the client
* Easier to extend and test