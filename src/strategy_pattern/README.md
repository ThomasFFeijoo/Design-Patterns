The theme is that the decision on whether to do something one way or another way is dependent on situational factors, and you or your code would choose the correct strategy based on the situation.

Examples of use cases:
* A resource allocator. In manual resource management, this might be minimizing the time it takes for the resource to allocate, or minimizing fragmentation. Each strategy here has an "Allocate" method that has the same interface, with the user making a decision about which strategy to use based on what they are trying to optimize.
* A method for connecting and sending network data. Maybe in some cases you would prefer to connect and send UDP datagrams, maybe in other situatinos where performance was less of a factor you would send using TCP/IP.
* Data formatting/serialization strategy. Allow the code to decide whether an object should be serialized with Json or with Xml. Maybe one for machines, and the other for human-readable situations. Both strategies have a "Serialize" method which takes an object. Each serializes differently.
