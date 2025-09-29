Singleton Pattern Demo: 
City Electricity Grid Manager
This Java project is a simple command-line application that demonstrates the Singleton Design Pattern. It simulates a central ElectricityGridManager for a city, which is responsible for tracking the total power consumed by various consumers. The core principle of the Singleton pattern is to ensure that only one instance of this manager can exist throughout the application's lifecycle, providing a single, global point of access to it.

Design Pattern: Singleton
This program is a classic example of the Singleton creational design pattern. This pattern restricts the instantiation of a class to a single object.

Key Implementation Details in ElectricityGridManager
Private Constructor: The class has a private constructor (private ElectricityGridManager()) to prevent other classes from creating new instances using the new keyword.

Private Static Instance: A private static variable (instance) holds the one and only instance of the class.

Public Static Access Method: A public static method, getInstance(), provides the global point of access. It checks if an instance already exists. If not, it creates one (lazy initialisation); otherwise, it returns the existing instance.

 Singleton useage:
A city's electricity grid is a perfect real-world analogy for a singleton. There should only be one central authority managing the total power consumption for the entire city. Using a Singleton pattern for the ElectricityGridManager:

Ensures a single, consistent state for the totalPowerConsumed variable.

Prevents the creation of multiple, conflicting manager objects that would lead to incorrect power consumption data.
Code Components:
ElectricityGridManager.java: This is the Singleton class.

It maintains the state of the city's total power consumption (totalPowerConsumed).

It provides methods like reportConsumption(String consumerName, int units) to update the state and showStatus() to display it.

SingletonElectricityDemo.java: This is the client class that uses the Singleton.

It interacts with the user to get consumer data.

It obtains the single instance of the manager via ElectricityGridManager.getInstance().

At the end, it explicitly demonstrates the singleton property by showing that two different variables pointing to getInstance() refer to the exact same object in memory.

 Run:
 Compile the Java code:
 javac SingletonElectricityDemo.java
 Run the application:
 java SingletonElectricityDemo
