/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author porti
 */
import java.util.Arrays;

public class PalindromoAir {
    private Tickett[] seats;
    
    public PalindromoAir() {
        seats = new Tickett[30];
    }
    
    public int firstAvailable() {
        return firstAvailable(0);
    }
    
    private int firstAvailable(int index) {
        if (index < seats.length) {
            if (seats[index] == null) {
                return index;
            } else {
                return firstAvailable(index + 1);
            }
        }
        return -1;
    }
    
    public int searchPassenger(String name) {
        return searchPassenger(name, 0);
    }
    
    private int searchPassenger(String name, int index) {
        if (index < seats.length) {
            if (seats[index] != null && seats[index].getPassengerName().equals(name)) {
                return index;
            } else {
                return searchPassenger(name, index + 1);
            }
        }
        return -1;
    }
    
  public boolean isPalindromo(String name) {
    name = name.replaceAll("\\s", "").toLowerCase();
    
    // Compara la cadena original con su reverso.
    int length = name.length();
    for (int i = 0; i < length / 2; i++) {
        if (name.charAt(i) != name.charAt(length - i - 1)) {
            return false; 
        }
    }
    
    return true; 
}
  
    public void printPassengers() {
        for (Tickett seat : seats) {
            if (seat != null) {
                System.out.println("Nombre: " + seat.getPassengerName() + ", Precio Pagado: " + seat.getTotalPaid());
            }
        }
    }
    
    public double income() {
        double totalIncome = 0.0;
        for (Tickett seat : seats) {
            if (seat != null) {
                totalIncome += seat.getTotalPaid();
            }
        }
        return totalIncome;
    }
    
    public void reset() {
        Arrays.fill(seats, null);
    }
    
    public void sellTicket(String name) {
        int availableSeat = firstAvailable();
        if (availableSeat != -1) {
            double ticketPrice = 800.0;
            if (isPalindromo(name)) {
                ticketPrice *= 0.8; // Aplicar descuento del 20% si es pal�ndromo
            }
            seats[availableSeat] = new Tickett(name, ticketPrice);
            System.out.println("Boleto vendido a " + name + " por $" + ticketPrice);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }
    
    public boolean cancelTicket(String name) {
        int passengerIndex = searchPassenger(name);
        if (passengerIndex != -1) {
            seats[passengerIndex] = null;
            return true;
        }
        return false;
    }
    
    public void dispatch() {
        double totalIncome = income();
        System.out.println("Ingresos totales: $" + totalIncome);
        reset();
    }
}

