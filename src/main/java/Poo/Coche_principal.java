
package Poo;

public class Coche_principal {

    public static void main(String[] args) {
        Coche Renault = new Coche();
        Renault.setColor("verde");
        Renault.setAsientos("Si");
        Renault.setAcondicionador("no");
        System.out.println(Renault.getDatos());
    }
    
}

