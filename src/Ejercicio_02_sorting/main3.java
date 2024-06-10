package Ejercicio_02_sorting;

public class main3 {
    public static void main(String[] args) {
        OrdenarUnStack ordenar = new OrdenarUnStack();
        ordenar.agregar(10);
        ordenar.agregar(60);
        ordenar.agregar(30);
        ordenar.agregar(40);
        ordenar.agregar(80);
        ordenar.agregar(20);
        ordenar.ordernarStack();
        System.out.println(ordenar.pop());
        System.out.println(ordenar.pop());
        System.out.println(ordenar.pop());
        System.out.println(ordenar.pop());
        System.out.println(ordenar.pop());
        System.out.println(ordenar.pop());
    }
}
