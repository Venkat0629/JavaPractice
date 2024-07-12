package assignment.design.patterns.creational;

interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.property);
    }

    @Override
    public String toString() {
        return "ConcretePrototype with property: " + property;
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Initial property");

        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        System.out.println(clone1);

        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        clone2 = new ConcretePrototype("Modified property");
        System.out.println(clone2);
    }
}
