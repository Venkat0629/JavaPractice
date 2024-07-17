package assignment.w2d1;

class Container<T, U> {
    private T t;
    private U u;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
}

class Main1 {
    public static void main(String[] args) {
        Container<String, Number> container = new Container<>();
        container.setT("Nisum");
        container.setU(25);
        System.out.println(container.getT() + " " + container.getU());
    }
}
