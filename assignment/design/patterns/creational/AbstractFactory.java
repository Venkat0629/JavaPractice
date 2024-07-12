package assignment.design.patterns.creational;

interface Button {
    void click();
}

class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("WinButton clicked");
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("MacButton clicked");
    }
}

interface Checkbox {
    void check();
}

class WinCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("WinCheckbox checked");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("MacCheckbox checked");
    }
}

interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory(); // or new MacFactory()
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.click();
        checkbox.check();
    }
}
