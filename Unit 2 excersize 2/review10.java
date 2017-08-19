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

public class review10
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.###");
	double radius, area;
	final double PI = 3.14;
	int response;
	
	System.out.print ("Please enter the number of times you wish the program to run: ");
	response = Integer.parseInt (stdin.readLine());
	
	for (int i = 1; i <= response; i++)
	{
	
	System.out.println ("i =" + i);
	System.out.print ("Please enter the radius of the circle (cm): ");
	radius = Double.parseDouble (stdin.readLine ());
	
	area = PI * ( radius * radius);
	System.out.println ("Area of the cirlce with the given radius is " + df.format(area) + ("cm"));
	
	}
    }
}

