
package Poo;

import java.util.Scanner;

public class Coche_principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String color, asientos, acondicionador;
        
        Coche Renault = new Coche();
        
        PedirDatos(sc, Renault);
        
        
        Renault.setAsientos("Si");
        Renault.setAcondicionador("no");
        System.out.println(Renault.getDatos());
    }

    private static void PedirDatos(Scanner sc, Coche Renault) {
        String color;
        String acondicionador;
        String asientos;
        System.out.println("Introduce el color del coche");
        color = sc.nextLine();
        Renault.setColor(color);
        System.out.println("Contiene acondicionadores? si o no?");
        acondicionador= sc.nextLine();
        Renault.setAcondicionador(acondicionador);
        System.out.println("Los asientos son de cuero? si o no?");
        asientos = sc.nextLine();
        Renault.setAsientos(asientos);
    }
    
}

