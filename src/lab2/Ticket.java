/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author nathalia.romero
 */
public class Ticket {
             // Atributos
    //Atributo String
    private String nombrePasajero;
    
    //Atributo double 
    private double totalPagado;

    // Constructor
    public Ticket(String nombrePasajero, double totalPagado) {
        this.nombrePasajero = nombrePasajero;
        this.totalPagado = totalPagado;
    }

    // Funciones get
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    // Funcion print
    public void print() {
        System.out.println("Nombre del pasajero: " + nombrePasajero);
        System.out.println("Total pagado: " + totalPagado);
    }

   
}
