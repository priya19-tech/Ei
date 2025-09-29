Food Delivery Service:


This is a simple Java application that simulates a food delivery service, demonstrating the Strategy design pattern. The application allows a user to select different delivery methods, each with its own cost and delivery time.

Design Pattern:
The core of this project is the Strategy design pattern, which defines a family of algorithms, encapsulates each one, and makes them interchangeable. This allows the algorithm to be selected at runtime.

Key Components:
DeliveryStrategy.java: This is the Strategy interface. It declares the common methods (deliver and calculateCost) for all delivery options.

Concrete Strategies:

NormalDelivery.java: The basic, standard delivery option.

ExpressDelivery.java: A faster option with an additional cost.

EcoBikeDelivery.java: An eco-friendly choice that offers a discount.

DroneDelivery.java: The fastest option, but the most expensive.

DeliveryContext.java: This is the Context class. It holds a reference to a DeliveryStrategy object and interacts with it. The DeliveryContext doesn't know the specific implementation of the strategy; it only knows the DeliveryStrategy interface. This allows for flexible and dynamic behavior.

Main.java: The client class that drives the application. It creates a DeliveryContext and allows the user to choose a delivery strategy at runtime, which is then set on the context.

Run:

Prerequisites
Java Development Kit (JDK) 8 or higher.

Compile the Java files:

javac strategies/*.java context/*.java Main.java

Run the application:

java Main
