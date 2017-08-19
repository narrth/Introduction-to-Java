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

public class methods
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.###");
	int response, num2;
	double num1, value, num3;
	final double PI = 3.141592654;

	System.out.println ("Please choose (by typing) one of the following methods into the space given");
	System.out.println ("[1] pow\n[2] sqrt\n[3] abs\n[4] round\n[5] sin\n[6] ceil\n[7] floor");

	response = Integer.parseInt (stdin.readLine ());

	switch (response)
	{
	    case 1:
	    //num1 is the base value and num2 is the exponential value
		System.out.print ("Please enter the number you wish to be your base value: ");
		num1 = Double.parseDouble (stdin.readLine ());
		System.out.print ("Please enter the number you wish to be your exponent: ");
		num2 = Integer.parseInt (stdin.readLine ());

		value = Math.pow (num1, num2);
		System.out.println("Your answer is " + (df.format (value)));
		break;

	    case 2:
	    //num1 is the user input value of the number to be uder the square root 
		System.out.print ("Please enter the number you wish to be under the square root: ");
		num1 = Double.parseDouble (stdin.readLine ());
		System.out.println ("Your answer is " + (df.format (Math.sqrt (num1))));
		break;
	    case 3:
	    //num1 is the value to find the absolute total for
		System.out.print ("Please enter the number you wish to find the absolute total for: ");
		num1 = Double.parseDouble (stdin.readLine ());
		System.out.println ("Your answer is " + (df.format (Math.abs (num1))));
		break;

	    case 4:
	    //num1 is the number inputed to be rounded
		System.out.print ("Please enter the number you wish to be rounded: ");
		num1 = Double.parseDouble (stdin.readLine ());
		System.out.println ("Your answer is " + (df.format (Math.round (num1))));
		break;
	 
		case 5:
		//num1 is the user inputed value in angles. num3 is the variable used for the angle valuse converted to radians. Pi is quite obvious
		System.out.println("Please enter the number you wish to be an angle value");
		num1 = Double.parseDouble(stdin.readLine());
		num3 = num1 * PI / 180;
		System.out.println ("Your answer is " + (df.format (Math.sin (num3)))); 
		break;

		case 6:
		//num1 is the number to be rounded up
		System.out.println("Please enter the number you wish to be rounded up");
		num1 = Double.parseDouble (stdin.readLine());
		System.out.println ("Your answer is " + (df.format(Math.ceil(num1))));


		break;

		case 7:
		//num1 is the number to be rounded down
		System.out.println("Please enter the number you wish to be rounded down");
		num1=Double.parseDouble(stdin.readLine());
		System.out.println ("Your answer is " + (df.format(Math.floor(num1))));
		break;  
	    default:
		System.out.println ("You have done sum ting wong.");

	}
    }
}
