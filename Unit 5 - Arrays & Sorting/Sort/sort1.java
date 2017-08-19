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

public class sort1
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	BufferedReader reader = new BufferedReader (new FileReader ("Unsort.txt"));
	BufferedWriter writer = new BufferedWriter (new FileWriter ("sorted1.txt"));
	DecimalFormat df = new DecimalFormat ("#");
	int MAX = 50;

	String[] names = new String [MAX];
	String line = null;
	int count = 0;
	int count2;
	int count3;

	String temp;

	while ((line = reader.readLine ()) != null)
	{
	    names [count] = line;
	    System.out.println (names [count]);
	    count++;
	}
	reader.close ();
	for (int i = 0 ; i < count ; i++)
	{
	    for (int j = i + 1 ; j < count ; j++)
	    {
		if ((names [j].compareTo (names [i])) < 0)
		{
		    temp = names [i];
		    names [i] = names [j];
		    names [j] = temp;
		}
	    }


	}

	
	System.out.println();
	System.out.println("The sorted names are: ");
	for (count3 = 0 ; count3 < count ; count3++)
	{
	    writer.write(names[count3]);
	    writer.newLine();
	    System.out.println (names [count3]);
	}
    writer.close();
	}
}


