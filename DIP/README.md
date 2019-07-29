# Dependency inversion principle

the dependency inversion principle is a specific form of decoupling software modules.

When following this principle, the conventional dependency relationships established from high-level, policy-setting modules to low-level, dependency modules are reversed, thus rendering high-level modules independent of the low-level module implementation details. The principle states:

    A. High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g. interfaces).
    B. Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

The idea behind points A and B of this principle is that when designing the interaction between a high-level module and a low-level one, the interaction should be thought of as an abstract interaction between them. This not only has implications on the design of the high-level module, but also on the low-level one: the low-level one should be designed with the interaction in mind and it may be necessary to change its usage interface.

### Advantages of DIP:

    1. Separation of Concerns
    2. Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
    3. Configurable components makes application easily extendable
    4. Unit testing is easy with mock objects


### Disadvantage of DIP:

    1. If overused, it can lead to maintenance issues because effect of changes are known at runtime.
    2. Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been caught at compile time.