package assignment.design.patterns.structural;

interface Color {
    void applyColor();
}

class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Square filled with color ");
        color.applyColor();
    }
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}

public class BridgePattern {
    public static void main(String[] args) {
        Shape square = new Square(new RedColor());
        square.applyColor();

        Shape circle = new Circle(new BlueColor());
        circle.applyColor();
    }
}
