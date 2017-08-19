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
    static double median(double x1, double x2)
    {
    double median;
    median = (x1 + x2)/2;
    return median;
    } 
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");

	double x1, x2, MV;
	
	System.out.print("Please enter the first number: ");
	x1 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the second number: ");
	x2 = Double.parseDouble(stdin.readLine());
	System.out.println("The median of the given numbers is " + df.format(MV=median(x1,x2)));
    }
}

