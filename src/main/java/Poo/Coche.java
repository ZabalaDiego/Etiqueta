package Poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean acondicionador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        peso_plataforma = 700;
    }

    public String getRuedas() {
        return "Reudas: " + ruedas;
    }

    public String getPeso() {
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        if (asientos_cuero == true) {
            peso_total += 50;
        }
        if (acondicionador== true) {
            peso_total += 15;
        }
        return "Peso: " + peso_total +  "kg";
    }

    //Sintaxis: es publico dato_a_devolver nombre del metodo(){ codigo + return}
    public String getLargo() {
        return "largo: " + largo + "cm";
    }
    
    public String getAncho() {
        return "ancho: " + ancho + "cm";
    }

    public String getAsientos() {
        if (this.asientos_cuero == true) {
            return "cuenta con asientos de cuero";
        } else {
            return "No cuenta con asientos de cuero";
        }
    }

    public String getColor() {
        return "color: " + color;
    }

    public String getDatos() {
        return "Coche con: " + getRuedas() + " " + getColor() + " " + getPeso() + " " + getLargo() + " " + getAncho() + " " + getAcondicionador();
    }

    //Sintaxis: public void nombre del metodo (parametros){ codigo}
    public void setColor(String color) {
        this.color = color;
    }

    public void setAsientos(String asientoscuero) {
        if (asientoscuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public void setAcondicionador(String acondicionador) {
        if (acondicionador.equalsIgnoreCase("si")) {
            this.acondicionador= true;
        } else {
            this.acondicionador = false;
        }
    }
    
    public String getAcondicionador (){
        if(this.acondicionador==true){
            return "Cuenta con acondicionador";
        } else {
            return "No cuenta con acondicionador";
        }
    } 
}
