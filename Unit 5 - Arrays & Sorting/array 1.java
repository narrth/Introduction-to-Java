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
    static int[] x = new int [10];
    static final int MAX = 10;

    static void InitializeArray (int entries)
    {
	int i;
	for (i = 0 ; i < entries ; i++)
	{
	    x [i] = -1;

	}

    }


    static void EnterFromKeyboard (int entries) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	int i;
	for (i = 0 ; i < entries ; i++)
	{
	    System.out.print ("Please enter a value: ");
	    x [i] = Integer.parseInt (stdin.readLine ());
	    System.out.println (i + " = " + x [i]);
	}
    }


    static void CountWhole (int entries)
    {
	int i;
	int b;
	b = 0;
	for (i = 0 ; i < entries ; i++)
	{
	    if (x [i] > 0)
	    {
		b++;
	    }

	}
	System.out.println ("There are " + b + " whole numbers.");
    }


    static void Display (int entries)
    {
	int i;
	System.out.print ("The integers in order entered are ");
	for (i = 0 ; i < entries ; i++)
	{
	    System.out.print (x [i] + " ");
	}
	System.out.println ();
    }


    static void DisplayReverse (int entries)
    {
	int i;
	System.out.print ("The integers in reverse order entered are ");
	for (i = entries - 1 ; i >= 0 ; i--)
	{
	    System.out.print (x [i] + " ");
	}
	System.out.println ();
    }


    static void sum (int entries)
    {
	int i, total;
	total = 0;
	for (i = 0 ; i < entries ; i++)
	{
	    total = total + x [i];
	}
	System.out.println ("The sum of all the numbers entered is " + total);
    }


    static void Average (int entries)
    {
	DecimalFormat df = new DecimalFormat ("#");
	int i, total;
	total = 0;
	for (i = 0 ; i < entries ; i++)
	{
	    total = total + x [i];
	}
	total = total / entries;
	System.out.println ("The average of all the numbers entered correct to 1 decimal place is " + df.format (total));
    }


    static void FindMax (int entries)
    {
	int i, greatest;
	greatest = x [1];
	for (i = 0 ; i < entries ; i++)
	{
	    if (x [i] >= greatest)
	    {
		greatest = x [i];
	    }
	}
	System.out.println ("The maximum number stored in the array is " + greatest);
    }


    static void FindMin (int entries)
    {
	int i, least;
	least = x [1];
	for (i = 0 ; i < entries ; i++)
	{
	    if (x [i] <= least)
	    {
		least = x [i];
	    }
	}
	System.out.println ("The minimum number stored in the array is " + least);
    }


    static void Search (int entries, int number)
    {
	int i, random;
	random = 0;
	System.out.print ("The number " + number + " is found in the following positions: ");
	for (i = 0 ; i < entries ; i++)
	{
	    if (x [i] == number)
	    {
		System.out.print (i + " ");
	    }

	    else
	    {
		random = random + 1;
	    }
	}
	if (random == entries)
	{
	    System.out.println ("none");
	}
	System.out.println ();
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");

	int response, repeat, counter, entries, number;
	String response2;

	do
	{
	    System.out.print ("Please enter the number of array values you wish to enter(maximum of 10): ");
	    entries = Integer.parseInt (stdin.readLine ());

	    InitializeArray (entries);
	    EnterFromKeyboard (entries);


	    System.out.print ("Please enter the desired times you wish to repeat this program: ");
	    repeat = Integer.parseInt (stdin.readLine ());


	    for (counter = 0 ; counter < repeat ; counter++)
	    {
		System.out.println ("This program will do any one of the following please choose one:\n[1] Calculate and display the number of whole numbers entered into the array\n[2] Display the list of inputted integers in the order entered\n[3] Display the list of inputted integers in reverse order entered\n[4] The sum of all the numbers entered\n[5] The average of all the numbers entered correct to 1 decimal place\n[6] Calculate and display the maximum number stored in the array\n[7] Calculate and display the minimum number stored in the array\n[8] Display the position(s) in the array a specific number occupies");
		response = Integer.parseInt (stdin.readLine ());

		switch (response)
		{
		    case 1:

			CountWhole (entries);
			break;

		    case 2:
			Display (entries);
			break;

		    case 3:
			DisplayReverse (entries);
			break;

		    case 4:
			sum (entries);
			break;

		    case 5:
			Average (entries);
			break;

		    case 6:
			FindMax (entries);
			break;

		    case 7:
			FindMin (entries);
			break;
		    case 8:
			System.out.println ("Please enter a number you wish to search for: ");
			number = Integer.parseInt (stdin.readLine ());
			Search (entries, number);
			break;
		    default:
			System.out.println ("Somebody going to get hurt real bad!!!");
		}
	    }
	    System.out.print ("Do you wish to repeat the program (y/n) ");
	    response2 = stdin.readLine ();
	}
	while (response2.equals ("y"));
    }
}

