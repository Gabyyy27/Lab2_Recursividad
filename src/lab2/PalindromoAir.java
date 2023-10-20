/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author nathalia.romero
 */
public class PalindromoAir {
        private Ticket[] airplaneSeats;

    public PalindromoAir() {
        airplaneSeats = new Ticket[30];
    }

    // 1- Int firstAvailable
    public int firstAvailable(int index) {
        if (index < airplaneSeats.length) {
            if (airplaneSeats[index] == null) {
                return index;
            }
            return firstAvailable(index + 1);
        }
        return -1;
    }

    public int firstAvailable() {
        return firstAvailable(0);
    }

    // 2- Int searchPassenger
    public int searchPassenger(String name, int index) {
        if (index < airplaneSeats.length) {
            if (airplaneSeats[index] != null && airplaneSeats[index].getNombrePasajero().equals(name)) {
                return index;
            }
            return searchPassenger(name, index + 1);
        }
        return -1;
    }

    public int searchPassenger(String name) {
        return searchPassenger(name, 0);
    }

    // Función 3
    public boolean isPalindromo(String name) {
        name = name.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (name.length() <= 1) {
            return true;
        }
        if (name.charAt(0) == name.charAt(name.length() - 1)) {
            return isPalindromo(name.substring(1, name.length() - 1));
        }
        return false;
    }

    // Función 4
    public void printPassengers(int index) {
        if (index < airplaneSeats.length) {
            if (airplaneSeats[index] != null) {
                System.out.println("Nombre: " + airplaneSeats[index].getNombrePasajero() +
                                   " - Precio pagado: " + airplaneSeats[index].getTotalPagado());
            }
            printPassengers(index + 1);
        }
    }

    public void printPassengers() {
        printPassengers(0);
    }

    // Funcion 5
    public double income(int index) {
        if (index < airplaneSeats.length) {
            if (airplaneSeats[index] != null) {
                return airplaneSeats[index].getTotalPagado() + income(index + 1);
            }
            return income(index + 1);
        }
        return 0.0;
    }

    public double income() {
        return income(0);
    }

    // Función 6
    public void reset(int index) {
        if (index < airplaneSeats.length) {
            airplaneSeats[index] = null;
            reset(index + 1);
        }
    }

    public void reset() {
        reset(0);
    }

    // Función 7
    public void sellTicket(String name) {
        int availableSeat = firstAvailable();
        if (availableSeat != -1) {
            double ticketPrice = 800.0;
            if (isPalindromo(name)) {
                ticketPrice -= (0.20 * ticketPrice);
            }
            airplaneSeats[availableSeat] = new Ticket(name, ticketPrice);
            System.out.println("Venta exitosa. Monto a pagar: $" + ticketPrice);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    // Función 8
    public boolean cancelTicket(String name) {
        int seatIndex = searchPassenger(name);
        if (seatIndex != -1) {
            airplaneSeats[seatIndex] = null;
            return true;
        }
        return false;
    }

    // Función 9
    public void dispatch() {
        double totalIncome = income();
        System.out.println("Ingresos generados: $" + totalIncome);
        reset();
    }
    
    
}
