package Logica;

import Interfaces.Dibujable;
import Interfaces.Figura;
import Interfaces.Rotable;

import java.text.DecimalFormat;

// para implementar una interface se debe de agregar la palabra reservado implements
public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // mano de decimales con la clase Decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        final double PI = 3.1416;
        double resultado = PI * (radio * radio);
        return Double.parseDouble(df.format(resultado));
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
}
