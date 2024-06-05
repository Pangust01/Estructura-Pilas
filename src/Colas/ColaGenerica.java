package Colas;

import java.util.NoSuchElementException;

import Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int tamanio;
    public ColaGenerica(){
        this.first=null;
        this.last=null;
        this.tamanio=0;
    }

    public void addNode(T data){
        NodoGenerico<T> nuevNodoGenerico = new NodoGenerico<T>(data);
        if (isEmpty()) {
            first=nuevNodoGenerico;
            last=nuevNodoGenerico;
            tamanio++;
        } else {
            last.next=nuevNodoGenerico;
            last=nuevNodoGenerico;
            tamanio++;
        }

    }

    public boolean isEmpty(){
        return first==null;
    }

    public T remove(){
        if (isEmpty()) {
            throw new NoSuchElementException("No hay una cola agregada");
        } else {
            T valor = first.data;
            first = first.next;
            tamanio--;
            if (first==null) {
                last=null;
            }
            return valor;

        }
    }

    public T peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("No hay una cola agregada");
        }
        return first.data;
    }
    public int size(){
        return tamanio;
    }
}
