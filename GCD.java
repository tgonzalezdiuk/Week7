/***
Name: Tamara Gonzalez 
Date: 04/17/24
Program: Java
 */

import java.util.*;
public class GCD 
{
    public static void main(String[] args )
    {
        int temperature = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        int integer1 = input.nextInt();
        System.out.print("Enter another non-negative integer: ");
        int integer2 = input.nextInt();

        while (integer2 > 0) 
        {
            temperature = integer2;
            integer2 = integer1 % integer2;
            integer1 = temperature;
                
        
        }
        int GCD = integer1;
        System.out.println("The GCD is " + GCD);

        input.close();

    }
}