package Ejercicio_03_linkedLists;

import java.util.NoSuchElementException;

import Materia.Pilass.Models.Node;

public class LinkedListEjr {
    public int getByPos(int position){
        ListaEnlazada2 list = new ListaEnlazada2();
        list.addNode(1);
        list.addNode(3);
        list.addNode(6);
        list.addNode(8);
        list.addNode(9);
        if (list.head == null) {
            throw new NoSuchElementException("La Lista esta vacia");
        }
        if (position < 0) {
            throw new NoSuchElementException("No hay posicion negativa");
        }
        if (position >= list.size()) {
            throw new NoSuchElementException("No hay numero en esa posicion");
        }
        list.print();
        Node actual = list.head;
        for (int i = 1; i < list.size()-position; i++) {
            actual= actual.next;
        }
        return actual.value;
    }



}
