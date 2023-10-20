/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author porti
 */

public class Tickett {
    private String passengerName;
    private double totalPaid;

    public Tickett(String passengerName, double totalPaid) {
        this.passengerName = passengerName;
        this.totalPaid = totalPaid;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void print() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Total Paid: $" + totalPaid);
    }

   
}
