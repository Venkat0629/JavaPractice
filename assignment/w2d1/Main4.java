package assignment.w2d1;

interface Pair<K, V> {
    K getK();

    V getV();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K k;
    private V v;

    public OrderedPair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    @Override
    public K getK() {
        return k;
    }

    @Override
    public V getV() {
        return v;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Pair<Integer, Double> pair1 = new OrderedPair<>(1, 20.258);
        Pair<Integer, String> pair2 = new OrderedPair<>(1, "Pair");
        System.out.println("Pair: { " + pair1.getK() + ", " + pair1.getV() + " }");
        System.out.println("Pair: { " + pair2.getK() + ", " + pair2.getV() + " }");
    }

}
