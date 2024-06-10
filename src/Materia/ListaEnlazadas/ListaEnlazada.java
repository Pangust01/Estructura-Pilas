package Materia.ListaEnlazadas;

import Materia.Pilass.Models.Node;


public class ListaEnlazada {
    public Node head;
    public int tamanio;
    public ListaEnlazada(){
        head = null;
        tamanio=0;
    }

    public void addNode(int value){
        if (head == null) {
            head = new Node(value);
            return ;
        }
        Node actual = head;
        while (actual.next!=null) {
            actual = actual.next;
        }
        actual.next=new Node(value);
        tamanio++;
    }
    //Metodo para eliminar
    public void deleteNode(int value){
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }

        Node actual = head;
        while (actual.next!=null) {
            if (actual.next.value==value) {
                actual.next=actual.next.next;
                tamanio--;
                return;
            }
            actual = actual.next;
        }
    }

    public void print(){
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node actual = head;
        while (actual.next!=null) {
            System.out.println("Node ->"+actual.value);
            actual=actual.next;
            }
        System.out.println("Node ->"+actual.value);
        System.out.println("Fin de la lista");
    }
    public int size(){
        return tamanio;
    }
}
