package UnitPrice;

import java.util.Scanner;

public class UnitPricing {
    public static void main(String[] args)  {
        
        Scanner stdin = new Scanner (System.in);
        int inputQuantity = 0, inputPrice = 0, amount = 0;
        
        System.out.print("Please enter the Quantity desired: ");
        inputQuantity = stdin.nextInt();      
        
        System.out.print("Please enter the Unit price: $");
        inputPrice = stdin.nextInt();
        
        amount = inputPrice * inputQuantity;
        
        System.out.print("The total amount is: $");
        System.out.print(amount);
        
    }
}
