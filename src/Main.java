import Logica.Circulo;
import Logica.Cuadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo();
        Cuadrado cuadraro = new Cuadrado();

        System.out.println("******* Crear figuras *******");

        System.out.println("Ingrese el lado del cuadrado:");
        cuadraro.setLado(scanner.nextDouble());
        System.out.println("Ingrese el radio del circulo:");
        circulo.setRadio(scanner.nextDouble());

        // mostrar datos
        System.out.println("**** Mostrar datos *********\n");
        System.out.println("Cuadrado");
        double area = cuadraro.calcularArea();
        System.out.println("Area del cuadrado: " + area);
        cuadraro.dibujar();
        System.out.println("-----------------------------\n");
        System.out.println("Circulo");
        double areaCirculo = circulo.calcularArea();
        System.out.println("Area del circulo: " + areaCirculo);
        circulo.dibujar();
        circulo.rotar();
    }
}