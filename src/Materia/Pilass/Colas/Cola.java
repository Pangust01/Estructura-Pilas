package Materia.Pilass.Colas;

import java.util.NoSuchElementException;

import Materia.Pilass.Models.Node;

public class Cola {
    private Node first;
    private Node last;
    private int tamanio;
    public Cola() {
        this.first=null;
        this.last=null;
        this.tamanio=0;
    }
    public boolean isEmpty(){
        return first == null;
    }
    //Meotodo agregar un Node a la cola
    public void addNode(int valor){
        Node newNode = new Node(valor);
        if (isEmpty()) {
            first = newNode;
            last= newNode;
            tamanio++;
        }else{
            last.next=newNode;
            last=newNode;
            tamanio++;
        }
    }

    public int peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;
    }

    public int remove(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        int valor=first.value;
        first = first.next;
        tamanio--;
        if (first==null) {
            last=null;
        }
        return valor;
    }

    public int size(){
        return tamanio;
    }

}
