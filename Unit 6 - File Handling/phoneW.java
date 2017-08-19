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

public class phone
{
    public static void main (String str[]) throws IOException
    {

	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");
	final int MAX = 50;

	String[] names = new String [MAX];
	int[] phone = new int [MAX];


	String response, name, number, response2;

	do
	{

	    int count = 0;
	    int count2 = 0;
	    String line = null;
	    BufferedReader reader = new BufferedReader (new FileReader ("friends.txt"));

	    System.out.println ("The names and phone numbers are: ");
	    while ((line = reader.readLine ()) != null)
	    {
		names [count] = line;
		System.out.println (names [count]);
		count++;
	    }
	    reader.close ();
	    System.out.println ("There are " + count + " names and phone numbers entered into the program.");

	    System.out.println ("Would you like to add any names & phone numbers?(Y/N)");
	    response = stdin.readLine ();
	    BufferedWriter writer = new BufferedWriter (new FileWriter ("friends.txt"));
	    while (names [count2] != null)
	    {
		line = names [count2];
		writer.write (line);
		writer.newLine ();
		count2++;
	    }


	    if (response.equals ("Y") || response.equals ("y"))
	    {


		System.out.println ("Please enter a name: ");
		name = stdin.readLine ();
		System.out.println ("Please enter a phone number: ");
		number = stdin.readLine ();
		writer.write (name);
		writer.newLine ();
		writer.write (number);
		writer.newLine ();
	    }



	    writer.close ();
	    System.out.println ("Would you like to repeat the program?(Y/N) ");
	    response2 = stdin.readLine ();
	}
	while ((response2.equals ("Y") || response2.equals ("y")));

    }
}


