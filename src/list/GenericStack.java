package list;

import java.util.ArrayList;

public class GenericStack <T>{

    private static final int TOP = 0;

    private ArrayList<T> collection = new ArrayList<>();

    public void push(T element) {
        collection.add(TOP, element);
    }

    public T pop() {
        return collection.remove(TOP);
    }

    public int size() {
        return collection.size();

    }

    public T get( int valor) {
        return collection.get(valor);
    }
}
