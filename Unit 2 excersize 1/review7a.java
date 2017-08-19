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

public class review7a
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));


	int x, y, x2;
	

	System.out.print ("Please enter the initial value of x you would like: ");
	x = Integer.parseInt (stdin.readLine ());
	System.out.print ("Please enter the final value of x you would like: ");
	x2 = Integer.parseInt (stdin.readLine ());

	while (x < x2 + 1)
	{

	    y = 5 * x - 1;


	    System.out.println ("X                       Y");
	    System.out.println (x + "                      " + y);
	    System.out.println ();

	    x = x + 1;

	}

    }
}


