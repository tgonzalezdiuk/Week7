/****
Name: Tamara Gonzalez
Date: 4/17/24
Program: Java
 ****/

import java.util.*;


public class Prompter
{
    public static void main(String[] args)
    
    {
        
        int Minimum = 0;
        int Maximum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum value in the range: ");
        Minimum = input.nextInt();
        
        System.out.print("Enter the maximum value in the range: ");
        Maximum = input.nextInt();
        
        System.out.print("Enter a number withing the range entered: ");
        int Number = input.nextInt();

        while(Number <= Minimum || Number >= Maximum)
        {
            System.out.print("Enter a number withing the range entered: ");
            Number = input.nextInt();
        }
        
        input.close();
    }
}
