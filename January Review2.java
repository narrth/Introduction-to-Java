/*--------------------------------------------------------------------------------------*/
/*  template.java  -  this program will  will determine the average of 2 marks          */
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
    static void averageA (double []mark1, double []mark2)throws IOException
    {
    BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
    System.out.print("Please enter the first mark: ");
    mark1[0] = Double.parseDouble(stdin.readLine()); 
    System.out.print("Please enter the second mark: ");
    mark2[0] = Double.parseDouble(stdin.readLine());
    }
    static double averageB (double [] mark1, double [] mark2, double [] averagemark)
    {
    averagemark[0]=(mark1[0] + mark2[0])/2;
    return averagemark[0];
    }
    static void averageC (double [] averagemark)
    {
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.print("The average mark is " + df.format(averagemark[0]));
    }
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");
	double [] mark1 = new double [1];
	double [] mark2 = new double [1];
	double [] averagemark = new double [1];

	averageA(mark1,mark2);
	averageB(mark1,mark2, averagemark);
	averageC(averagemark);
    }
}

