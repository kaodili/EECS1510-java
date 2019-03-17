package Distance;

import java.util.Scanner;


public class Distance {
    
    // Written by: Kaodili Okwuaka 
    // Calculates the distance between two points using points x1, y1 
    // and y1, y2 as inputs.
    
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner (System.in);
        double x1, y1, x2, y2 ;
        double d;
        
        System.out.print("Enter x1 and y1: ");
        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        x2 = stdin.nextDouble();
        y2 = stdin.nextDouble();
        
        d = Math.sqrt((Math.pow(x2-x1, 2)) + Math.pow((y2-y1), 2));
                
        System.out.print("The distance is " +d);
                
    }
}
