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

public class review6
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));


	int number;
	int numbersq;

	number = 0;
       
	while (number < 21)
	{

	    numbersq = number * number;


	    System.out.println (" X                       Y    ");
	    System.out.println (number + "                     " + numbersq);
	    System.out.println ();

	    number = number + 1;

	}

    }
}


