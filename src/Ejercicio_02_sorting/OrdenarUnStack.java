package Ejercicio_02_sorting;

import java.util.EmptyStackException;
import java.util.Stack;

import Ejercicio_02_sorting.Nodo;

public class OrdenarUnStack {

     private Nodo top;

    public OrdenarUnStack(){
        top = null;

    }

    public void agregar(Integer data){
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println( "La pila esta vacia");
            throw new EmptyStackException();
        }
        int data = top.value;
        top = top.next;
        return data;
        
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println( "La pila esta vacia");
            throw new EmptyStackException();
        }
        System.out.println(top.value);
        return top.value;
    }

    public void ordernarStack(){
        while (isEmpty()==true) {
            int saveNum = pop();
            while (isEmpty()==true && peek()>saveNum) {
                agregar(pop());
            }
            agregar(saveNum);
        }
        while (isEmpty()==true) {
            agregar(pop());
        }
    }

}
