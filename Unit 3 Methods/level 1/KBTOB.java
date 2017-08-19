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
    static double KBTOB(double KB)
    {
    double KBTOB;
    KBTOB = KB * 1024;
    return KBTOB;
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#.##");

	double KB, B;
	
	System.out.print("Please enter the amount of Kilo Bytes you would like to convert to Bytes: ");
	KB = Double.parseDouble(stdin.readLine()); 
	System.out.println("Your answer in Bytes is " + df.format( B = KBTOB(KB)));
    }
}

