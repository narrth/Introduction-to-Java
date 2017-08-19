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
    static double median (double x1, double x2)
    {
	double median;
	median = (x1 + x2) / 2;
	return median;
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.#");

	double x1, x2, y1, y2, MVx, MVy, i, response;

	System.out.print ("Please enter the number of times you would like to run the program: ");
	response = Double.parseDouble (stdin.readLine ());

	for (i = 0 ; i < response ; i++)
	{
	    System.out.print ("Please enter the first x coordinate: ");
	    x1 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the second x coordinate: ");
	    x2 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the first y coordinate: ");
	    y1 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the second y coordinate: ");
	    y2 = Double.parseDouble (stdin.readLine ());
	    System.out.println ("The median of the given coordinates are " + df.format (MVx = median (x1, x2)) + "," + df.format (MVy = median (y1, y2)));
	}
    }
}

