Stock Price Notifier:

This is a simple Java application that demonstrates the Observer design pattern. It simulates a stock market where investors can subscribe to a specific stock to receive real-time price updates.

About the Project:

The core of this project is the Observer design pattern, a behavioral pattern where an object (the subject) maintains a list of its dependents (the observers) and notifies them automatically of any state changes, usually by calling one of their methods.

Key Components:
Subject.java: This is the Subject interface. It defines the contract for objects that can be observed. It includes methods for registering, removing, and notifying observers.

Observer.java: This is the Observer interface. It defines the contract for objects that want to be notified of changes. It contains a single update method.

Stock.java: This is the Concrete Subject. It implements the Subject interface. It holds the stock's symbol and price, and a list of registered Observer objects. When its price changes, it notifies all subscribed observers.

Investor.java: This is the Concrete Observer. It implements the Observer interface. It represents an investor who receives updates from a Stock object.

Logger.java: A utility class used for consistent logging of events and errors with timestamps.

Main.java: The client class that drives the application. It sets up the stocks, creates an investor, and handles user interaction, allowing the investor to subscribe to a stock and receive price updates as they are entered.

Run:
Prerequisites
Java Development Kit (JDK) 8 or higher.
Compile the Java files:
javac *.java
Run the application:
java Main

