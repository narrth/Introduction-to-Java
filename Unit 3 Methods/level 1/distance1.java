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

public class distance1
{
    static double distance (double x1, double y1, double x2, double y2)
    {
    double distance;
    distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
    
    
    return distance;
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#.##");

	double x1, x2, y1, y2, value;
	
	System.out.print("Please enter an x co-ordinate: ");
	x1 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a y co-ordinate: ");
	y1 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a second x co-ordinate: ");
	x2 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a second y co-ordinate: ");
	y2 = Double.parseDouble(stdin.readLine());
	
	System.out.println("You answer is " + (df.format( value = distance (x2, x1, y2, y1))));
    }
}

