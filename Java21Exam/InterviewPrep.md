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

#### Controlling Program Flow
	- Basic conditional logic
		- if-else, ternary expressions, switch statements
	- Switch expressions
		- non final local variable is not allowed; 
			even if its method param or an method reference too
		- switch statement vs switch expression (default can be optional)
			- return, yield (returns value, exits switch not the method)
	- Patterns matching
	- Looping
	- Advanced control flow

#### Using Object-Oriented Concepts in Java

#### Handling Exceptions
	- Within your control
	- Outside your control
	- try catch finally or try with resources
#### Working with Arrays and Collections
	- 
#### Working with Streams and Lambda expressions
  	- Lambda experssions
		- an anonymous function
		- may take prarameters and return a value
		- treated like data: it can be passed to a method or stores in a variable
		- type inferances
		- variable used in lambda expression should be final or effectively final
		- functional initerface; @FunctionalInterface 
			- an interface with exactly one abstract method
		- lambda expressions implements a functional interface
			- the parameters and return type of the LE must match the 
			   abstract method of the functional interface
		- java.util.function
			- interface Function<T,R> 	takes T returns R
			- consumer	Consumer<T>		only takes T 
			- supplier	Suppluer<R>		only returns R
			- predicate Predicate<T>	takes T returns boolean
			- UnaryOperator<T>			takes T returns T

			- BiFunction<T,	U, R>		takes type T,U returns type R
			- BiPredicate<T, U>			takes type T,U returns boolean
			- BinaryOperator<T>			takes type T,T returns type T

			- for efficiency, there are 
				- IntFunction<T> 		takes int returns R
				- IntConsumer	  		only takes int	
				- IntSupplier			only returns type int
				- IntPredicate			takes int returns boolean
			- Runnable 					takes nothing returns nothing
			- Comparator<T>				takes type T,T returns int

	- Method references implements a functional interface
	- Streams
		- A squenece of elements on which you can perform operations
		- Operations: filtering, transforming, sorting, collecting, searching
					  grouping, partitioning etc.
		- Does one thing at a time
		- Stream object
			- doesn't carry any data, only processes
				- build pipeline: derive an stream from data
				- intermediate; filtering, transforming, sorting ... 
				- terminary; collecting, checking, counting ..
			- not allowed to process the same stream twice
			- is lazy evaluation (i.e., only when terminary are there does execution of pipeline happens)
		- patterns to create an stream
			- from a collection, array, text, regular expression, string
		- methods; map/filter/terminal
		- one-to-many transformation
			- flatMap; takes stream gives stream
			- mapMulti; same as flatMap in different style
		- function should not have side effects
		- findFirst(), groupingBy(), partiotingBy()
		- parallel vs sequential stream; note for overhead associated & make sure no side effects
			- groupingBy(),
		

### Using Java I/O API
	- Basic file handling mechanisms
		- Create references to files and directories
	- Read from and write to files
		- InputStream, OutputStream
		- FileReader, FileWriter ...
	- Serialization (and deserialization)
	- Console: handling user input

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