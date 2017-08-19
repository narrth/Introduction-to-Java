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
	double y2, y1, x2, x1, y22, y12, x22, x12, slope1, slope2, response, i;
	
	System.out.print("How many times would you like to run this program:");
	response = Double.parseDouble(stdin.readLine());
	
	for(i=0;i<response;i++)
	{
	System.out.print("Please enter the first x co-ordinate: ");
	x1 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the second x co-ordinate: ");
	x2 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the first y co-ordinate: ");
	y1 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the second y co-ordinate: ");
	y2 = Double.parseDouble(stdin.readLine());
	
	System.out.print("Please enter the first x co-ordinate of the second line: ");
	x12 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the second x co-ordinate of the second line: ");
	x22 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the first y co-ordinate of the second line: ");
	y12 = Double.parseDouble(stdin.readLine());
	System.out.print("Please enter the second y co-ordinate of the second line: ");
	y22 = Double.parseDouble(stdin.readLine());
	
	slope1 = slope(y2,y1,x2,x1);
	slope2 = slope(y22,y12,x22,x12);
	
	if(slope1 == slope2)
	{
	System.out.println("The two lines are parallel\n" + slope1 + "\n" + slope2 + "\n");
	}
	
	else if (slope1 != slope2);
	{
	System.out.println("The two lines are not parallel\n" + slope1 + "\n" + slope2 + "\n");
	}
	}
    }
}

