package decorator;

/*
Decorator is structural design pattern which lets you attach new behaviour to objects
by wrapping them inside special wrapper objects

Beverage Could be many types like coffee, milk, water
If we use inheritance then their will many classes. Classes like water with lemon, coffee with latte etc
will require a dedicated class which will be hard to maintain.
Decorator class can be used here to reduce them number of class. Beverage class which contains cost attribute and
which other can either directly implement like coffee, water. Decorator classes can be also made
which will contain Beverage class object.

OO principle - Favour composition over inheritance
Classes should be open for extension and closed for modification
 */

public abstract class Beverage {
    protected String description = "Unknown";

    public String getDescription() {
        return description;
    }
    public abstract int cost();
}
