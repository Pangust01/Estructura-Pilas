package Pilass;

import Models.Node;
import java.util.EmptyStackException;

public class Pila {
    private Node top;

    public Pila(){
        top=null;
    }

    //Push: Agregar elementos a la pila
    public void push(int value){
        Node nuevNode = new Node(value);
        nuevNode.next = top;
        top=nuevNode;
    }

    public int pop(){
        if (top==null) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }else{
            int valor = top.value;
            top=top.next;
            return valor;
        }

    }

    public int peek(){
        if (top==null) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        return top.value;

    }
    
    public boolean isEmpty(){
        return top == null;
    }
}