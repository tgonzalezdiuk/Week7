/***
Name: Tamara Gonzalez 
Date: 03/19/24
Program: Java
 */

import java.util.*;
public class Grades 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Grade:");
        int Grade = input.nextInt(); 

        /*double Grade;*/

        if (Grade == 100) System.out.println("Congratulations you recived an A");
        
        if ((100 < Grade) && (Grade >= 90)) 
        {
            System.out.println("Congratulations you recived an A");
        }

        if ((90 > Grade) && (Grade >= 80)) 
        {
            System.out.println("Nice Job you recived a B, next time work a little herder for an A");
        }

        if ((80 > Grade) && (Grade >= 70)) 
        {
            System.out.println("You recived a C, Try something different next time");
        }
        
        if ((70 > Grade) && (Grade >= 65)) 
        {
            System.out.println("You recived a D, that is on the brink of failure, watch out :/");
        }

        if (Grade <= 64) 
        {
            System.out.println("You recived an F, for Failure");
        }

        input.close();

    }

}


