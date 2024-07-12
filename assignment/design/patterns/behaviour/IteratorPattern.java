package assignment.design.patterns.behaviour;

interface Container {
    Iterator getIterator();
}

class NameRepository implements Container {
    private String[] names;

    public NameRepository() {
        this.names = new String[]{"John", "Doe", "Jane"};
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}

interface Iterator {
    boolean hasNext();

    Object next();
}

class NameIterator implements Iterator {
    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return names[index++];
        }
        return null;
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
