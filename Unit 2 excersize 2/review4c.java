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

public class review4a
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	int disks, cost, totaldisks, cost4, costt;
	String responsemember;
	String responsemember1;
	String response;

	totaldisks = 0;
	cost4 = 0;
	costt = 0;
	do
	{
	    System.out.print ("Please enter the number of disks to be puchased: ");
	    disks = Integer.parseInt (stdin.readLine ());

	    System.out.print ("Are you a member? (Y/N):");
	    responsemember = stdin.readLine ();

	    totaldisks = totaldisks + disks;


	    if ((responsemember.equals ("Y")) || (responsemember.equals ("y")))
	    {
		cost = disks * 4;
		System.out.println ();
		System.out.println ("The cost of each disk is $4 and your total is $" + cost);
		System.out.println ();
		cost4 = cost4 + cost;
		costt = costt + cost;


	    }

	    else if ((responsemember.equals ("N")) || (responsemember.equals ("n")))
	    {
		cost = disks * 6;
		System.out.println ();
		System.out.println ("The cost of each disk is $6 and your total is $" + cost);
		System.out.println ();
		costt = costt + cost;

	    }

	    else if (!(responsemember.equals ("Y/N")) || !(responsemember.equals ("y/n")))
	    {

		System.out.print ("please type in Y or N:");
		responsemember1 = stdin.readLine ();
	    }

	    System.out.print ("are you done (y/n): ");
	    response = stdin.readLine ();
	    System.out.println ();

	}
	while ((response.equals ("N")) || (response.equals ("n")));
	System.out.println ();
	System.out.println ("Thank you converting with me");
	System.out.println ("your total amount of disks is: " + totaldisks + " disks");
	System.out.println ("The total amount of money collected when disks are priced at $4 is: " + "$" + cost4);
	System.out.println ("the total amount of money collected is: $" + costt);
	System.out.println ("Please come again.");
	System.out.println ();


    }
}




