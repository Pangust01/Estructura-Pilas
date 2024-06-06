package Ejercicio_01_sign;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class verificarSignos {
    private Node signo;

    public verificarSignos(){
        signo=null;
    }

    //Push: Agregar elementos a la pila
    public void push(String value){
        Node nuevNode = new Node(value);
        nuevNode.next = signo;
        signo=nuevNode;
    }

    public String pop(){
        if (signo==null) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }else{
            String valor = signo.value;
            signo=signo.next;
            return valor;
        }

    }

    public String peek(){
        if (signo==null) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        return signo.value;

    }
    
    public boolean isEmpty(){
        return signo == null;
    }

    public void verificar(){
        
    }
}
