/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author nathalia.romero
 */
public class Main {
     public static void main(String[] args) {
        PalindromoAir palindromoAir = new PalindromoAir();

       
        palindromoAir.sellTicket("ana");
        palindromoAir.sellTicket("maria");
        palindromoAir.sellTicket("juan");
        palindromoAir.sellTicket("lucas");

        palindromoAir.printPassengers();
        System.out.println("Ingresos generados: $" + palindromoAir.income());

        palindromoAir.cancelTicket("juan");
        palindromoAir.dispatch();
    }
}
