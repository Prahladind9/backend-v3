# Java 21
https://education.oracle.com/java-se-21-developer-professional/pexam_1Z0-830
## Java SE 21 Developer (Exam 1Z0-830): 
	- Controlling Program Flow
	- Using Object-Oriented Concepts in Java
	- Handling Exceptions
	- Working with Arrays and Collections
	- Working with Streams and Lambda expressions
	- Packaging and Deploying Java Code
	- Managing Concurrent Code Execution
	- Using Java I/O API
	- Implementing Localization


#### Handling Exceptions
	- Within your control
	- Outside your control
	- try catch finally or try with resources
#### Working with Arrays and Collections
	- 
#### Working with Streams and Lambda expressions
  	- Lambda experssions
		- An anonymous function
		- May take prarameters and return a value
		- Treated like data: it can be passed to a method or stores in a variable 

## New Features
	- Project Loom; enhance concurrent programming via lighweight concurrency
	- Project Panama; interconnecting JVM with native code
	- Project Amber; incubate smaller, productvity-oriented Java Language features
	- Data Oriented Programming
	- Project Layden; AOT Cache, improve startup, warmup i.e, faster bootup time
	- Tip & tail release modelling for dependency libraries
	- Continuations

### Managing Concurrent Code Execution
- Concurrency Problem
	Begin suspend/resumed end
	the runnable interface > functional interface
- Continuation is the data structure which saves the state of the threads
- Sleep is non blocking
- A thread is an native/platform thread, created on operating system
	- virtual thread is mounted on top native thread
	- virtual threads 
		- use for i/o operations
		- not for compute/cpu intense jobs