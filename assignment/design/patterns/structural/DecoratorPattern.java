package assignment.design.patterns.structural;

interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

class TomatoSauce extends PizzaDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", tomato sauce";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());

        Pizza decoratedPizza = new TomatoSauce(new Cheese(new PlainPizza()));
        System.out.println("Ingredients: " + decoratedPizza.getDescription());
        System.out.println("Cost: $" + decoratedPizza.getCost());
    }
}
