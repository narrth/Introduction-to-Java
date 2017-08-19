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
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");
	final int MAX = 100;

	String[] names = new String [MAX];
	String[] lognum = new String [MAX];
	String line = null;
	int count = 0;
	int count2;
	String temp;
	int i, j;

	BufferedReader reader = new BufferedReader (new FileReader ("login.txt"));
	while ((line = reader.readLine ()) != null)
	{
	    names [count] = line;
	    System.out.println (names [count]);
	    line = reader.readLine ();
	    lognum [count] = line;
	    System.out.println (lognum [count]);
	    count++;
	}
	reader.close();

	for (i=0;i<count;i++)
	{
	    for (j=i+1;j<(count);j++)
	    {
		if ((lognum [i].compareTo (lognum [j])) < 0)
		{
		    temp = lognum [i];
		    lognum [i] = lognum [j];
		    lognum [j] = temp;
		    temp = names [i];
		    names [i] = names [j];
		    names [j] = temp;
		}
	    }
	}

	System.out.println("The names in order are: ");
	BufferedWriter writer = new BufferedWriter (new FileWriter ("sorted2.txt")); 
	for(count2=0;count2<count;count2++)
	{
	System.out.println(names[count2]);
	System.out.println(lognum[count2]);
	writer.write(names[count2]);
	writer.newLine();
	writer.write(lognum[count2]);
	writer.newLine();
	}
	writer.close();
    }
}

