package Ejercicio_01_sign;

import java.util.EmptyStackException;


public class verificarSignos {
    private Nodo top;

    public verificarSignos(){
        top = null;

    }

    public void agregarSignos(Character data){
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public char pop(){
        if (isEmpty()) {
            System.out.println( "La pila esta vacia");
            throw new EmptyStackException();
        }
        char data = top.value;
        top = top.next;
        return data;
        
    }

    public char peek(){
        if (isEmpty()) {
            System.out.println( "La pila esta vacia");
            throw new EmptyStackException();
        }
        System.out.println(top.value);
        return top.value;
    }

    public boolean verificar(){
        if (top.value=='['||top.value=='{'||top.value=='(') {
            return false;
        }
        while (top.next!=null) {
            if (peek()==']'|| peek()=='}'||peek()==')') {
                char signo = peek();
                pop();
                if (peek()=='[') {
                    
                }
            }
        }

        
        return true;
    }

  
}
