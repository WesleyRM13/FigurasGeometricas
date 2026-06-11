/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Student
 */
public abstract class Figuras {

    protected double getArea() {
        return this.calcularArea();
    }

    protected double getPerimetro() {
        return this.calcularPerimetro();
    }

    public abstract double calcularPerimetro();  
    public abstract double calcularArea();  
    
    
    
}
