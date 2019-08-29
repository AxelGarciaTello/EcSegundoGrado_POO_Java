
import java.util.Scanner;

public class EcuacionSegundoGrado {
    
    private Scanner teclado;
    
    public int[] pedirEcuacion(){
        teclado = new Scanner(System.in);
        int[] terminos = new int[3];
        System.out.println("Programa pasa solucionar ecuaciones cuadraticas de "
                + "la forma Ax2+Bx+C=0");
        System.out.println("Ingrese el coeficiente cuadratico (A):");
        terminos[0]=Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el coeficiente lineal (B):");
        terminos[1]=Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el termino independiente (C):");
        terminos[2]=Integer.parseInt(teclado.nextLine());
        return terminos;
    }
    
}
