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

public class interestBalance1
{
    static void interestBalance (double oldbalance, double interestrate, double [] interest, double [] newbalance)
    {    
    interest [0] = oldbalance * interestrate;
    newbalance [0] = oldbalance + interest [0];

    
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");
	double oldbalance, interestrate;
	double [] newbalance = new double [1];
	double [] interest = new double [1];
	System.out.println("Please enter the balance amount in a savings account at the beginning of the year: ");
	oldbalance = Double.parseDouble(stdin.readLine());
	System.out.println("Please enter the current interest rate per annum in decimal format: ");
	interestrate = Double.parseDouble(stdin.readLine());
	
	interestBalance(oldbalance, interestrate, interest, newbalance);

	System.out.println("The interest received for the year is " + interest [0] + " dollars");
	System.out.println("The new balance is " + newbalance [0] + " dollars");        

    }
}

