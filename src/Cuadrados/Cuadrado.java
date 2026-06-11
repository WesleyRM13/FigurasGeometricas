/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadrados;
import Cuadrados.Cuadrado;
/**
 *
 * @author Student
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(double lado) {
        super(lado);
    }
    
    protected double calcularArea(){
        return Math.pow(lado, 2);
    }
    
    protected double calcularPerimetro (){
        return lado + lado + lado + lado;
    }

    @Override
    public String toString() {
        return "Cuadrado" + "Lado: " + lado + "Area: " + calcularArea() + "Perimetro: "
                + calcularPerimetro();
    }
    
    
    
}