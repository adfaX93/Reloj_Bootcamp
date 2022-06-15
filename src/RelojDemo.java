import java.util.Scanner;
import java.util.*;


public class RelojDemo {
    public static void main(String[] args) {
        int segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del tiempo en segundos:");
        segundos = sc.nextInt();
        Reloj reloj = new Reloj(segundos);
        System.out.println(reloj.toSg());
        for (int i=0; i<10; i++){
            reloj.tick();
            System.out.println(reloj.toSg());
        }
        System.out.println("Ingrese otro valor del tiempo en segundos:");
        segundos = sc.nextInt();
        Reloj reloj1 = new Reloj(segundos);
        System.out.println(reloj1.toSg());
        System.out.println("Diferencia absoluta entre los tiempos es: "+reloj.restaReloj(reloj1));

        System.out.println("Hola Alex que tal");
        reloj.imprimirMensaje();

    }
}
