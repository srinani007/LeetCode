package Excel;

public class Node {
    public Object element;
    public Node next;
    public Node(){
        this(null,null);
    }

    public Node(Object e, Object n) {
        element = e;
        next = (Node) n;
    }

    Object getElement(){
        return element;
    }

    Node getNext(){
        return next;
    }

    public void setElement(Object newElem) {
        element = newElem;
        throw new UnsupportedOperationException("Unimplemented method 'setElement'");
    }

    public void setNext(Node newNext) {
        next = newNext;
        throw new UnsupportedOperationException("Unimplemented method 'setNext'");
    }


}
