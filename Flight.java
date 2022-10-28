import java.util.Scanner;

public class Flight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        
        System.out.print("Please enter the distance as km: ");
        int distance = input.nextInt();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Please select your ticket type(1 for Round Ticket, 2 for One-Way Ticket): ");
        int flightType = input.nextInt();
        
        if(age > 0 && age < 12){
            price = distance * 0.1 * 0.5;
        }else if (age > 12 && age < 24){
            price = distance * 0.1 * 0.9;
        }else if (age > 65){
            price = distance * 0.1 * 0.7;
        }else {
            price = distance * 0.1;
        }
        
        switch(flightType){
            case 1:
                price *= 0.8;
                break;
            case 2:
                price = price;
                break;
            default:
                System.out.println("Please check your information!");
        }
        
        if(age < 0){
            System.out.println("Please check your information!");
        } else {
            System.out.println("Total price is " + price + " USD.");
        }
    }
}
