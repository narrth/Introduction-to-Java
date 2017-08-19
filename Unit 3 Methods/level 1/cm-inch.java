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
    static double cmtoinch (double cm)
    {
    double cmtoinch;
    cmtoinch = cm / 2.54;
    return cmtoinch;
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");

	double cm, inch; 
	
	System.out.print("Please enter the number of Centimetres you would like to convert to Inches: ");
	cm = Double.parseDouble(stdin.readLine());
	System.out.print("The number of Inches converted from Centimetres are: " + (df.format( inch = cmtoinch(cm))));
    }
}

