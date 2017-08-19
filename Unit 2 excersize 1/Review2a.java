/*--------------------------------------------------------------------------------------*/
/*  excersize1.java  -  Description                                                       */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:  Narrthanan Seevananthan                                                    */
/*  Date:    sept 22                                                                    */
/*--------------------------------------------------------------------------------------*/
/*  Input:                                                                              */
/*  Output:                                                                             */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class Review2
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	String name;
	int money, quarters, remainder;

	for (int i = 1 ; i <= 5 ; i++)
	{


	    System.out.print ("# = " + i);


	    System.out.print (" Please enter your name: ");
	    name = stdin.readLine ();
	    System.out.print ("Please enter the amount of money you have in cents: ");
	    money = Integer.parseInt (stdin.readLine ());

	    quarters = money / 25;
	    remainder = money % 25;

	    System.out.println ();
	    System.out.println ("The number of quarters you could have is: " + quarters);
	    System.out.println ();
	    System.out.println ("The amount of money that cannot be converted into quarters is: " + remainder);
	    System.out.println ();


	}
    }





}

