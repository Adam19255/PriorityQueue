# Printing Server and PriorityQueue
Authored by Adam Shay

## Overview
This project consists of two main classes, `PrintingServer` and `PriorityQueue`, designed to manage and prioritize print jobs.
The system operates based on the priority of each job, ensuring that higher priority print jobs are processed first.

## PrintingServer Class
The `PrintingServer` class represents a server responsible for handling and printing print jobs.
It utilizes a `PriorityQueue` to manage the order of print jobs based on their priority.

### Constructor
* **PrintingServer():** The default constructor initializes the server with an empty priority queue.

### Methods
* **acceptJob(PrintJob p):** Accepts a print job (`PrintJob` object) and places it in the correct position within the priority queue based on its priority.
* **print():** Prints the highest priority job in the queue and removes it from the queue.

## PrintJob Class
The `PrintJob` class represents an individual print job.
It implements the `Prioritizeable` interface, allowing it to be prioritized within the priority queue.

### Constructor
* **PrintJob(String text, int priority):** Initializes a print job with the given text and priority. It ensures that the priority is within the valid range.

### Methods
* **getPriority():** Returns the priority of the print job.
* **setPriority(int p):** Sets the priority of the print job to the specified value.
* **getText():** Returns the text content of the print job.

## Prioritizeable Interface
The `Prioritizeable` interface defines the contract for objects that can be prioritized.
It includes methods to get and set the priority.

## PriorityQueue Class
The `PriorityQueue` class represents a priority queue for managing prioritized elements implementing the Prioritizeable interface.

### Constructor
* **PriorityQueue():** The default constructor initializes the priority queue with a fixed size.

### Methods
* **insert(Prioritizeable element):** Inserts a prioritized element into the queue, maintaining the order based on priority.
* **remove():** Removes and returns the highest priority element from the queue.
* **toString():** Provides a string representation of the priority queue, displaying the contents in order.
