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

public class template
{

    static void sale (double basePrice, double discountRate, double[] discount, double[] finalPrice)
    {
	discount [0] = discount [0] + (basePrice - (basePrice * discountRate));
	finalPrice [0] = finalPrice [0] + (basePrice * discountRate);
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	int counter, repeat;
	    double basePrice, discountRate;
	double[] discount = new double [1];
	double[] finalPrice = new double [1];

	discount [0] = 0;
	finalPrice [0] = 0;

	System.out.print ("Please enter the number of items you wish to purchase: ");
	repeat = Integer.parseInt (stdin.readLine ());

	for (counter = 0 ; counter < repeat ; counter++)
	{
	    System.out.print ("Please enter the regular price of the item you wish to purchase: ");
	    basePrice = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the discount rate(in decimal format) of the item you wish to purchase: ");
	    discountRate = Double.parseDouble (stdin.readLine ());
	    sale (basePrice, discountRate, discount, finalPrice);
	}
    
	System.out.println("The total amount of money you saved is "+discount[0]+ " dollars" );
	System.out.print("The final price of the combined items is "+finalPrice[0]+" dollars" );
	}
}

