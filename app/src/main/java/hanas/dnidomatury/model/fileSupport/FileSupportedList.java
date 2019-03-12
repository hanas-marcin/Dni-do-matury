package hanas.dnidomatury.model.fileSupport;

public interface FileSupportedList<T> extends FileSupported<FileSupportedList<T>>, Iterable<T>{

    int size();
    boolean isEmpty();
    boolean add(T newElement);
    void add(int position, T newElement);
    boolean remove(Object oldElement);
    void sort();
    void clear();
    T get(int element);
    T remove(int index);
}
