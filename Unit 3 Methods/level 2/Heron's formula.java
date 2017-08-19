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
    static double distance (double x1, double y1, double x2, double y2)
    {
    double distance;
    distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
    return distance;
    }

    static double Heron ( double s, double a, double b, double c)
    {
    double Heron;
    Heron = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return Heron;
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");

	double x1, y1, x2, y2, x3, y3, a, b, c, s, A;
	int response, i;
	
	System.out.print("Please enter the number of times you would like to run the program: ");
	response = Integer.parseInt(stdin.readLine());
	
	for(i=1;i<=response;i++)
	{
	System.out.print("Please enter an x co-ordinate: ");
	x1 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a y co-ordinate: ");
	y1 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a second x co-ordinate: ");
	x2 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a second y co-ordinate: ");
	y2 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a third x co-ordinate: ");
	x3 = Double.parseDouble(stdin.readLine());
	System.out.print ("Please enter a third y co-ordinate: ");
	y3 = Double.parseDouble(stdin.readLine());
	
	a = distance (x2, x1, y2, y1);
	b = distance (x3, x2, y3, y2);
	c = distance (x1, x3, y1, y3);
	s = (a+b+c)/ 2;
	A = Heron(s, a, b, c);
	
	System.out.println("The area of the triangle with the given co-ordinates is " + df.format(A) + " square units");
	}

    }
}

