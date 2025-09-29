
Smart Home Temperature Adapter:

This project demonstrates the Adapter design pattern in Java. It shows how to integrate a third-party temperature sensor that provides readings in Fahrenheit into a smart home system that requires temperatures in Celsius.

Project Structure:

TemperatureSensor.java: This class represents a third-party temperature sensor. It's a simple class that provides temperature readings in Fahrenheit using a random value generator. We cannot modify this class, as it simulates an external library or component.

TemperatureProvider.java: This is the target interface our smart home system expects. It defines a single method, getTemperatureInCelsius(), which a client (like SmartHomeUser) uses to get a temperature reading in Celsius.

FahrenheitToCelsiusAdapter.java: This class is the core of the Adapter pattern. It adapts the TemperatureSensor to the TemperatureProvider interface. It takes an instance of TemperatureSensor in its constructor, retrieves the temperature in Fahrenheit, converts it to Celsius, and then returns the converted value as required by the TemperatureProvider interface.

SmartHomeUser.java: This class acts as the client. It interacts with the TemperatureProvider interface to check the room temperature. It doesn't know or care whether the underlying sensor provides data in Fahrenheit or Celsius, demonstrating the decoupling provided by the adapter.

LoggerUtil.java: A simple utility class for logging messages and errors to the console.

CustomException.java: A custom exception class used to handle specific errors, such as an invalid temperature reading.

TemperatureAppDemo.java: The main class to run the application. It sets up the objects, connects the adapter, and provides a simple command-line interface for the user to interact with the system.

Demonstrating the Adapter Pattern:

This project showcases the Adapter pattern by:

Allowing the SmartHomeUser (the client) to work with a TemperatureSensor (the adaptee) without any knowledge of its incompatible interface.

Using the FahrenheitToCelsiusAdapter as the adapter to bridge the gap between the two incompatible interfaces.

Ensuring that the SmartHomeUser only needs to interact with the TemperatureProvider interface (the target), promoting a clean and flexible design.





