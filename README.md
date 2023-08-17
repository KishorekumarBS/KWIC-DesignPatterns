# KWIC-DesignPatterns
This project focuses on designing and implementing a modular Keyword In Context (KWIC) processing system. The system is built using various design patterns to ensure flexibility, maintainability, and adherence to SOLID principles. 

## Version-1
In the first version, the program employs the Abstract Factory, Singleton, and Builder patterns to create a cohesive and loosely coupled architecture.
The Abstract Factory pattern is employed to create a family of related components (Input, Shifter, Sorter, and Output) without specifying their concrete classes. Each component has its associated factory interface and concrete factory implementations. This approach follows the Dependency Inversion Principle (DIP) and facilitates easy addition of new components.

The Singleton pattern is utilized for the OptionalFeatures class, ensuring a single instance and global access. This maintains the Single Responsibility Principle (SRP) and grants consistent access to shared settings.

The Builder pattern constructs a KWICProcessor instance step by step, allowing easy configuration of its components. This adheres to the Open/Closed Principle (OCP) and provides a controlled object creation process.

## Version-2
In the second version (Version-2 UML Diagram), the Abstract Factory pattern is replaced with the Prototype pattern. This version enables the creation of new instances of components by cloning existing instances, enhancing flexibility and minimizing complex object creation processes.

The system's cohesion and low coupling are achieved by organizing classes and interfaces according to their functionalities and interactions. Despite the advantages of these patterns, there are trade-offs to consider. For example, the Abstract Factory pattern may introduce complexity during the addition of new classes, while the Prototype pattern might increase class dependencies, leading to higher coupling.

Ultimately, the project offers a comprehensive comparison between the two versions, highlighting the pros and cons of each set of design patterns. The choice between the Abstract Factory and Prototype patterns depends on the project's specific requirements, whether emphasizing flexibility through new object variations (Abstract Factory) or cost-effective object creation and cloning (Prototype). Overall, the project demonstrates a thoughtful approach to software design, balancing trade-offs to meet the project's goals effectively.
