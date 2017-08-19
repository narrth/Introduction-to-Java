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
    

    static void midpoint (double X1, double X2, double[] midpoint1)
    {

	midpoint1 [0] = (X1 + X2) / 2;
    }


    static double slope (double X1, double Y1, double X2, double Y2)
    {
	double slope;
	slope = (Y2 - Y1) / (X2 - X1);
	return slope;
    }


    static double legnth (double X1, double X2, double Y1, double Y2)
    {
	double legnth;
	legnth = Math.sqrt (((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2)));
	return legnth;
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.#");
	int response1;
	double X1, X2, Y1, Y2, slope1, distance1;
	double[] midpoint1 = new double [1];
	String response2;

	do
	{
	    System.out.println ("Please enter coordinates for 2 points. ");
	    System.out.print ("Please enter the first X coordinate for the first point: ");
	    X1 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the second Y coordinate for the first point: ");
	    Y1 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the first X coordinate for the second point: ");
	    X2 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the second Y coordinate for the second point: ");
	    Y2 = Double.parseDouble (stdin.readLine ());

	    System.out.println ("Please choose from the following options: \n[1] Calculate the slope of the line conecting two points\n[2] Calculate the distance form one point to another\n[3] Calculate the midpoint of the line conecting the two points given\n[4] Exit the program");
	    response1 = Integer.parseInt (stdin.readLine ());
	    switch (response1)
	    {
		case 1:
		    System.out.print ("The slope of the line is " + (df.format (slope1 = slope (X1, X2, Y1, Y2))));
		    break;

		case 2:
		    System.out.println ("The distance from the points entered is " + (df.format (distance1 = legnth (X1, X2, Y1, Y2))));
		    break;
		case 3:
		    midpoint (X1, X2 ,midpoint1);
		    System.out.print ("The midpoint of the line conecting the two point given is (" + df.format (midpoint1 [0]) + ",");
		    midpoint (Y1, Y2, midpoint1);
		    System.out.println (df.format (midpoint1 [0]) + ")");
		    break;
		default:
		    System.out.println ("You have done something wrong");
		    
	    }
	    System.out.print("Would you like to repeat the program(Y/N): ");
	    response2 = stdin.readLine();

	    
	}
	while((response2.equals ("Y")) || (response2.equals ("y")));
    }
}

