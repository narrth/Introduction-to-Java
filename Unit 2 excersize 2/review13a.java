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

public class review13a
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));

	int counter, correctcount, ranswer, response, response2, range;
	counter = 1;
	correctcount = 0;

	Random generator = new Random();
	
	System.out.print ("Please enter the number of times you want this program to run: ");
	response2 = Integer.parseInt (stdin.readLine());
	System.out.print ("Please enter the integer range you wish to recieve your questions (0-?-1): ");
	range = Integer.parseInt (stdin.readLine());
	
	while (counter <= response2)
	{
	
	int r = generator.nextInt(range);
	int r2 = generator.nextInt(range);
	
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

