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

public class review3
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	int legnth, width, perimiter, cost;
	String response;

	do
	{

	    System.out.print ("Please enter the legnth of the fenced area in meters: ");
	    legnth = Integer.parseInt (stdin.readLine ());
	    System.out.print ("Please enter the width of the fenced area in meters: ");
	    width = Integer.parseInt (stdin.readLine ());

	    perimiter = 2 * legnth + 2 * width;
	    cost = perimiter * 11;

	    System.out.println ();
	    System.out.println ("The amount of fencing needed in meters is " + perimiter + "m");
	    System.out.println ();
	    System.out.println ();
	    System.out.println ("The cost of the fencing in dollars is $" + cost);
	    System.out.println ();

	    System.out.print ("are you done (y/n): ");
	    response = stdin.readLine ();
	    System.out.println ();

	}

	while ((response.equals ("N")) || (response.equals ("n")));
	System.out.println ();
	System.out.println ("Thank you calculating with me");
	System.out.println ("Please come again.");
	System.out.println ();
    }
}


