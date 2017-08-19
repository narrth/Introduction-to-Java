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
    static void triangle (double legnth1, double legnth2, double legnth3)
    {
	if (legnth1 > legnth2 + legnth3)
	{
	    System.out.println ("A triangle could not be formed using these three sticks");
	}
	if (legnth1 <= legnth2 + legnth3)
	{
	    System.out.println ("A triangle could  be formed using these three sticks");
	}

    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");

	double legnth1, legnth2, legnth3;

	do
	{
	    System.out.print ("Please enter the longest legnth of the sticks: ");
	    legnth1 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the legnth of another stick: ");
	    legnth2 = Double.parseDouble (stdin.readLine ());
	    System.out.print ("Please enter the legnth of another stick: ");
	    legnth3 = Double.parseDouble (stdin.readLine ());
	    if (legnth1 <= legnth2 || legnth1 <= legnth3)
	    {
		System.out.println ("The first legnth isn't the longest try again");
	    }
	    if (legnth1 < 0 || legnth2 < 0 || legnth3 < 0)
	    {
		System.out.println ("One or more legnths are negative please try again");
	    }
	}
	while (legnth1 <= legnth2 || legnth1 <= legnth3 || legnth1 < 0 || legnth2 < 0 || legnth3 < 0);
	
	triangle(legnth1, legnth2, legnth3);




    }
}

