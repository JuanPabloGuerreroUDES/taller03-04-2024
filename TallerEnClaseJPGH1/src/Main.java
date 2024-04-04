
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LabSispc01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //persona
        persona persona1=new persona(LocalDate.of(2004, 5, 28));
        System.out.println("La edad acutla de la persona es: "+persona1.getEdad());
        
        
        
        
        //cuadrado
        cuadrado cuadrado1=new cuadrado(10);
        
        System.out.println("El area del cuadrado es: "+cuadrado1.getArea());
        System.out.println("El perimetro del cuadrado es: "+cuadrado1.getPerimetro());
        
        
        //circulo
        
        circulo circulo1=new circulo(10);
        
        System.out.println("El area del circulo es: "+circulo1.getArea());
        System.out.println("El perimetro del circulo: "+circulo1.getPerimetro());
        
        //triangulo
        triangulo triangulo1=new triangulo(10,10,15);
        
        System.out.println("El areal del triangulo es: "+triangulo1.getArea());
        System.out.println("El perimetro del triangulo es: "+triangulo1.getPerimetro());
        System.out.println("La hipotenusa del triangulo es: "+triangulo1.getHiportenusa());
    }
}
