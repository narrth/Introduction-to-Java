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

public class review7
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));


	int x;
	int y;

	x = 0;
       
	while (x < 11)
	{

	    y = 5 * x - 1;


	    System.out.println ("X                       Y");
	    System.out.println (x + "                      " + y);
	    System.out.println ();

	    x = x + 1;

	}

    }
}


