N-Dimensional Vector Class in Java
This repository contains a simple, mutable, n-dimensional vector class written in Java. The class demonstrates key object-oriented programming (OOP) concepts such as encapsulation, polymorphism, and cloning.

Features
The Vector class includes the following functionality:

Encapsulation: The internal list of coordinates is kept private, and access is managed through public methods like get() and set().

Polymorphism: The class overrides several core Object methods for custom behavior:

toString(): Provides a human-readable string representation of the vector.

equals(): Compares two vectors for equality based on their coordinates.

clone(): Creates a deep copy of the vector, ensuring independent instances.

Iteration: The class implements the Iterable interface, allowing vectors to be used in for-each loops to easily access each coordinate.

Vector Operations: Basic vector arithmetic, such as addition with another vector, is supported.

How to Use
The class is a self-contained .java file. You can simply add it to your Java project and create instances of the Vector class as needed.

Here's a brief example of how to use the class:

// Create two vectors
Vector v1 = new Vector(1.0, 2.0, 3.0);
Vector v2 = new Vector(4.0, 5.0, 6.0);

// Print the vectors and their lengths
System.out.println("Vector v1: " + v1);
System.out.println("Length of v1: " + v1.length());

// Add the two vectors and print the result
Vector sum = v1.add(v2);
System.out.println("v1 + v2 = " + sum);

// Iterate over the coordinates using a for-each loop
for (double coord : v1) {
    System.out.println("Coordinate: " + coord);
}


Contributing
Feel free to open an issue or submit a pull request if you find any bugs or have suggestions for improvements.
