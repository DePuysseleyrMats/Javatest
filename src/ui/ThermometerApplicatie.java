
package ui;

import domein.Thermometer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThermometerApplicatie {
    public static void main(String[] args) {
        boolean herhalen = true;
        do{
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("Geef temperatuur in graden F uit het interval [14-104]: ");
            int fahr = s.nextInt();
            
            Thermometer t = new Thermometer(fahr);
            int celcius = t.converteerNaarCelcius();
            System.out.printf("De temperatuur in graden C is: %d \t", celcius);
            
            herhalen = false;
            
            
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("Geef een geheel getal in.");
            s.nextLine(); //buffer leegmaken om infinite loop tegen te gaan
        }
        }while(herhalen);
    }
    
}
