/****
Name: Tamara Gonzalez
Date: 4/17/24
Program: Java
 ****/

import java.util.*;


public class Prompter{
    public static void main(String[] args){
        int min = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum value in the range: ");
        min = input.nextInt();
        System.out.print("Enter the maximum value in the range: ");
        max = input.nextInt();
        System.out.print("Enter a number withing the range entered: ");
        int num = input.nextInt();

        while(num <= min || num >= max)
        {
            System.out.print("Enter a number withing the range entered: ");
            num = input.nextInt();
        }
        
        input.close();
    }
}
