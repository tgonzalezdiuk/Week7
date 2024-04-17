/*******
Name: Tamara Gonzalez
Date: 4/17/24
Program: Java
********/

import java.text.NumberFormat;

public class Investment{
    public static void main(String[] args){
        double initialValue = 2500.00;
        double finalValue = 5000.00;
        int Years = 0;

        NumberFormat Currency= NumberFormat.getCurrencyInstance();
        
        while(initialValue < finalValue){

            initialValue += initialValue*0.075;
            Years += 1;

        }

        System.out.println("It will take " + (Years) +" years to reach " + Currency.format(initialValue));
    }
}