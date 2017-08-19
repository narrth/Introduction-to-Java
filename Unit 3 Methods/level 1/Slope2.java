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
    static double slope(double y2, double y1, double x2, double x1)
    {
    double slope;
    slope = (y2-y1)/(x2-x1);
    return slope;
    } 
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");

	double y2, y1, x2, x1, M;
	
	System.out.print("Please enter the first x co-ordinate: ");
	x1 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the second x co-ordinate: ");
	x2 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the first y co-ordinate: ");
	y1 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the first x co-ordinate: ");
	y2 = Double.parseDouble(stdin.readLine());
	System.out.println("The slope of the give co-ordinates is " + df.format(M=slope(y2,y1,x2,x1)));
    }
}

