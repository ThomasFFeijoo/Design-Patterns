Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

The participants classes in this pattern are:

* Observable - interface or abstract class defining the operations for attaching and de-attaching observers to the client. In the GOF book this class/interface is known as Subject.
* ConcreteObservable - concrete Observable class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.
* Observer - interface or abstract class defining the operations to be used to notify this object.
* ConcreteObserverA, ConcreteObserver2 - concrete Observer implementations.
