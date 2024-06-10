import Materia.ListaEnlazadas.ListaEnlazada;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Pila pila1 = new Pila();
        // pila1.push(10);
        // pila1.push(20);
        // pila1.push(30);
        // pila1.push(40);
        // System.out.println("Su elemento en la cima de la pila es: "+pila1.peek());
        // System.out.println("Elemento retirado de la pila es: "+pila1.pop());
        // System.out.println("Su elemento en la cima de la pila es: "+pila1.peek());
        // System.out.println("Elemento retirado de la pila es: "+pila1.pop());
        // System.out.println("Elemento retirado de la pila es: "+pila1.pop());
        // System.out.println("Su elemento en la cima de la pila es: "+pila1.peek());

        // System.out.println();

        // //Implementacion de pila generica
        // PilaGenerica<Pantalla> pilaGenerica = new PilaGenerica<>();
        // pilaGenerica.push(new Pantalla("Home Page", "/home"));
        // pilaGenerica.push(new Pantalla("Menu Page", "/home/menu"));
        // pilaGenerica.push(new Pantalla("Settings Page", "/home/menu/settings"));
        // System.out.println("Estoy en la pantalla: \n\t------>"+pilaGenerica.peek().getNombre());
        // System.out.println("Salir de la pantalla: \n\t------>"+pilaGenerica.pop().getNombre());
        // System.out.println("Estoy en la pantalla: \n\t------>"+pilaGenerica.peek().getNombre());
        // pilaGenerica.push(new Pantalla("User Page", "/home/menu/user"));
        // System.out.println("Estoy en la pantalla: \n\t------>"+pilaGenerica.peek().getNombre());
        // System.out.println("Salir de la pantalla: \n\t------>"+pilaGenerica.pop().getNombre());
        // System.out.println();
        // //IMPLEMENTACION DE COLAS
        // Cola cola=new Cola();
        // cola.addNode(10);
        // cola.addNode(20);
        // cola.addNode(30);
        // cola.addNode(40);
        // cola.addNode(50);
        // System.out.println("Tamaño es: "+cola.size());
        // System.out.println("Su primer elemento de la cola es "+cola.peek());//10
        // System.out.println("Su elemento en eliminado de la cola es "+cola.remove());//10
        // System.out.println("Su primer elemento de la cola es "+cola.peek());//20
        // System.out.println("Su elemento en eliminado de la cola es "+cola.remove());//20
        // System.out.println("Su primer elemento de la cola es "+cola.peek());//30
        // System.out.println("Su elemento en eliminado de la cola es "+cola.remove());//30
        // System.out.println("Su primer elemento de la cola es "+cola.peek());//40
        // System.out.println("Su elemento en eliminado de la cola es "+cola.remove());//40
        // System.out.println();
        // System.out.println("¿Su cola esta vacia?: "+(cola.isEmpty()? "Si":"No"));//true
        // System.out.println("Tamaño es: "+cola.size());
        // System.out.println();
        // //Implementacion de colas genericas
        // ColaGenerica<Pantalla> colaGenerica=new ColaGenerica<>();
        // colaGenerica.addNode(new Pantalla("Menu Page", "/menu"));
        // colaGenerica.addNode(new Pantalla("USERS", "/users"));
        // colaGenerica.addNode(new Pantalla("ESTUDIANTES", "/user"));
        // colaGenerica.addNode(new Pantalla("Escritorio", "/desktop"));
        // System.out.println("La cola tiene "+colaGenerica.size()+" elementos");
        // System.out.println("Esta en la Pantalla: \n\t------->"+colaGenerica.peek().getNombre());
        // System.out.println("Salio de la Pantalla: \n\t------->"+colaGenerica.remove().getNombre());
        // System.out.println("Esta en la Pantalla: \n\t------->"+colaGenerica.peek().getNombre());
        // System.out.println("Salio de la Pantalla: \n\t------->"+colaGenerica.remove().getNombre());
        // System.out.println("La cola tiene "+colaGenerica.size()+" elementos");

        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(2);
        lista.addNode(5);
        lista.addNode(8);
        lista.addNode(10);
        System.out.println(lista.size());
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(5);
        lista.print();
        System.out.println(lista.size());


        
    }
}
