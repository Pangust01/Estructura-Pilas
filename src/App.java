
import Models.Pantalla;
import Pilass.Pila;
import Pilass.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila1 = new Pila();
        pila1.push(10);
        pila1.push(20);
        pila1.push(30);
        pila1.push(40);
        System.out.println("Su elemento en la cima de la pila es: "+pila1.peek());
        System.out.println("Elemento retirado de la pila es: "+pila1.pop());
        System.out.println("Su elemento en la cima de la pila es: "+pila1.peek());
        System.out.println("Elemento retirado de la pila es: "+pila1.pop());
        System.out.println("Elemento retirado de la pila es: "+pila1.pop());
        System.out.println("Su elemento en la cima de la pila es: "+pila1.peek());

        System.out.println();

        //Implementacion de pila generica
        PilaGenerica<Pantalla> pilaGenerica = new PilaGenerica<>();
        pilaGenerica.push(new Pantalla("Home Page", "/home"));
        pilaGenerica.push(new Pantalla("Menu Page", "/home/menu"));
        pilaGenerica.push(new Pantalla("Settings Page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla: \n\t------>"+pilaGenerica.peek().getNombre());
        System.out.println("Salir de la pantalla: \n\t------>"+pilaGenerica.pop().getNombre());
        System.out.println("Estoy en la pantalla: \n\t------>"+pilaGenerica.peek().getNombre());
        pilaGenerica.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t------>"+pilaGenerica.peek().getNombre());
        System.out.println("Salir de la pantalla: \n\t------>"+pilaGenerica.pop().getNombre());


        

        
    }
}
