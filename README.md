# Builder-Design-Pattern
Steps to implement Builder design pattern
1. Create the Builder interface with the construction methods such as firstName(), lastName(), middleName(), etc.
2. Create the concrete builder CustomerBuilder that implements the Builder interface and overrides its methods. It has a build() method that returns the final Customer object.
3. Create the Customer class with mandatory and optional attributes. This Customer object will be constructed through the CustomerBuilder.
4. Create the Client class responsible for instantiating the CustomerBuilder and use it to build the Customer object.
