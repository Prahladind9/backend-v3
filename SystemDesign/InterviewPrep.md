System Design

Problem statement

- Why requirements clarification is so important?
- Requirements clarification
	1) Users/Customers
		- Who will use the system?
		- How the system will be used?	
	2) Scale (read and write)
		- How many read queries per second?
		- How much data is queried per request?
		- Can there be spikes in traffic?
	3) Performance
		- What is expected write-to-read data delay?
		- What is expected p99 latency for read queries?
	4) Cost
		- Should the design minimize the cost of development?
		- Should the design minimize the cost of maintenance?

Youtube views example
Count views
Analysis on count function

Design patterns 
load balancers
partition
cap theorm - consitenct availablity parition tolerance
circuit breaker
faukt tolerance