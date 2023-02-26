package patterns.composite.interfaces;

public interface Field<T> {
    String getName();
    T getValue();
    void print();
}
