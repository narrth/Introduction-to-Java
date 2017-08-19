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

public class review13
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));

	int counter, correctcount, ranswer, response;
	counter = 0;
	correctcount = 0;
	
	
	Random generator = new Random();
	
	while (counter <= 9)
	{
	
	int r = generator.nextInt(11);
	int r2 = generator.nextInt(11);
	
	ranswer = r + r2;
	
	System.out.print (r + " + " + r2 + " = ");
	response = Integer.parseInt (stdin.readLine());
	
	if (response == ranswer)
	{
	correctcount = correctcount + 1;
	}
	counter = counter + 1;
	
	}
	System.out.print ("The number of questions you have gotten correct is " + correctcount);
    }
}

