package Ejercicio_01_sign;

public class main2 {
    public static void main(String[] args) {
        verificarSignos vSignos = new verificarSignos();
        vSignos.agregarSignos(')');
        vSignos.agregarSignos('(');
        vSignos.agregarSignos('}');
        vSignos.agregarSignos('{');
        System.out.println(vSignos.verificar());

    }
    
}
