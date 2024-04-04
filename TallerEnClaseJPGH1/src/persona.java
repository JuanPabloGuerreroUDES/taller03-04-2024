
import java.time.LocalDate;
import java.time.Period;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc01
 */
public class persona {
    private LocalDate fechaNacimiento;

    public persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    //getters and setters

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "persona{" + "fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public Period getEdad(){
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual);
    }
    
    
    
}
