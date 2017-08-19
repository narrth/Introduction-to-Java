/*--------------------------------------------------------------------------------------*/
/*  template.java  -  Description                                                       */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:                                                                             */
/*  Date:                                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:                                                                              */
/*  Output:                                                                             */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class interestBalance
{
    static void interestBalance (double oldbalance, double interestrate)
    {
    double newbalance, interest;
    
    interest = oldbalance * interestrate;
    newbalance = oldbalance + interest;
    
    System.out.println("The interest received for the year is " + interest + " dollars");
    System.out.println("The new balance is " + newbalance + " dollars");
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");
	double oldbalance, newbalance, interestrate;
	
	System.out.println("Please enter the balance amount in a savings account at the beginning of the year: ");
	oldbalance = Double.parseDouble(stdin.readLine());
	System.out.println("Please enter the current interest rate per annum in decimal format: ");
	interestrate = Double.parseDouble(stdin.readLine());
	
	interestBalance(oldbalance, interestrate);

	

    }
}

