/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc01
 */
public class circulo {
    private double radio;

    //constructores
    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }
    
    //getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo{" + "radio=" + radio + '}';
    }
    
    //metodo
    public double getArea(){
        
        double area=(this.radio*this.radio)*3.1416;
        return area;
    }
    
    public double getPerimetro(){
        double perimetro=(this.radio*2)*3.1416;
        return perimetro;
    }
    
    
    
    
    
    
    
}
