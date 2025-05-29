public class StackLinkedList<T> implements Stack<T>{

    StackItem top;
    @Override
    public void push(T item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop() throws MyEmptyStackException {
        if (this.top == null){
            throw new MyEmptyStackException("Stack is Empty you can't pop anything from an empty stack");
        }
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    public void displayStack(){
        T tempNode = top;
        if(this.isEmpty()){
            System.out.println("The stack is empty!!!");

        }else{
            while (tempNode != null){
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext();
            }
        }
    }

    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }
}
