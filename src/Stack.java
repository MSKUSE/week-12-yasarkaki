public interface Stack <> {

    void push(T item);
    T pop() throws MyEmptyStackException;
    void peek();
    boolean isEmpty();


}
