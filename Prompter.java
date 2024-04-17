/******
Name: Tamara Gonzalez
Date: 04/17/24
Program: Java
 ******/

import java.util.*;


public class Prompter{
    public static void main(String[] args)
    {
        int minimum = 0;
        int maximum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum value: ");
        minimum = input.nextInt();

        System.out.print("Enter the maximum value: ");
        maximum = input.nextInt();

        System.out.print("Enter a number between the minimum and maximum numbers entered: ");
        int number = input.nextInt();

        while(number <= minimum || number >= maximum)
        {
            System.out.print("Enter a number withing the range entered: ");
            number = input.nextInt();
        }
        
        input.close();
    }
}
