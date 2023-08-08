package Logica;

import Interfaces.Dibujable;
import Interfaces.Figura;

// para implementar una interface se debe de agregar la palabra reservado implements
public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }

    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
}
