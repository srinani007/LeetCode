package Excel;

public class Linmkedstack implements Stack{
    private Node top;
    private int size;
    public Linmkedstack(){
        top=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    public void push(Object e){
        Node v = new Node();
        v.setElement(e);
        v.setNext(top);
        top=v;
        top=v;
        size++;
    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object temp=top.getElement();
        top=top.getNext();
        size--;
        return temp;
    }
    public Object top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return top.getElement();
    }

    
}
