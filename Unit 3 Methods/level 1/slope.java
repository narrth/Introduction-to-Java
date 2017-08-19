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
    static double slope (double rise, double run)
    {
    double slope;
    slope = rise / run;
    return slope;
    }
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#.##");

	double rise, run, slopevalue;
	
	System.out.print("Please enter the value of rise: ");
	rise = Double.parseDouble(stdin.readLine()); 
	System.out.print("Please enter the caluse of run: ");
	run = Double.parseDouble(stdin.readLine());
	System.out.println("The value of the slope is " + df.format(slopevalue = slope(rise,run))); 
	
    }
}

