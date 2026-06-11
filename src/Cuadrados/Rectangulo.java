/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadrados;

import figurasgeometricas.Figuras;

/**
 *
 * @author Student
 */
public class Rectangulo extends Figuras {
    private double diagonal;
    private double altura;
    private double base;
    protected double lado;

    public double getLado() {
        return lado;
    }

    
    
    public double getDiagonal() {
        return diagonal;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public Rectangulo(double diagonal, double altura, double base, double lado) {
        this.diagonal = diagonal;
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(double lado) {
        this.lado = lado;
    }


    
    @Override
    protected double calcularPerimetro(){
        return base*2 + altura*2;
    }
    
    @Override
    protected double calcularArea(){
        return base*altura;
    }
    
    private double calcularDiagonal(){
        return Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
    }

    @Override
    public String toString() {
        return "Rectangulo" + "diagonal: " + getDiagonal() + " altura: " + getAltura() + " base: " + getBase();
    }
    
    
    
}
