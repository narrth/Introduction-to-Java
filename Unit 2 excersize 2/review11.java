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

public class review11
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	final int CY = 2011;
	int birthyear, age, counter;
	counter = 0;
	
	while ( counter < 3)
	{
	System.out.print ("Please enter your year of birth: ");
	birthyear = Integer.parseInt (stdin.readLine());
	
	age = CY - birthyear;
	
	System.out.println ("your age is " + age + "year(s)");

	counter = counter + 1;
	}
    }
}

