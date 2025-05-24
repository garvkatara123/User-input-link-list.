# Linked List Implementation in Java

This Java program demonstrates a simple implementation of a singly linked list with basic operations such as inserting elements at the beginning and at the end, and printing the entire list.

---

## Features

- Insert a node at the beginning of the linked list.
- Insert a node at the end of the linked list.
- Print the current state of the linked list.
- Interactive menu-driven console interface for user input.

---

## How It Works

- The program uses an inner `Node` class to represent each element of the linked list, which contains a `String` data and a reference to the next node.
- `addfirst(String data)`: Adds a new node at the start of the list.
- `addlast(String data)`: Adds a new node at the end of the list.
- `printlist()`: Prints all nodes sequentially followed by "Null" to indicate the end of the list.
- The main method provides a looped menu for the user to choose actions until they decide to exit.

---

## How to Run

1. Save the code in a file named `linked_list.java`.
2. Compile the code using:
   ```bash
   javac linked_list.java
