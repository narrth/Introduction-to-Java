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
    static void input (double []x1, double [] x2, double[] x3, double[]y1, double[]y2, double[]y3)throws IOException
    {
    BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
    System.out.print("Please enter the first x coordinate: ");
    x1[0]=Double.parseDouble(stdin.readLine());
    System.out.print("Please enter the first y coordinate: ");
    y1[0] = Double.parseDouble(stdin.readLine());
    System.out.print("Please enter the second x coordinate: ");
    x2[0] = Double.parseDouble(stdin.readLine());
    System.out.print("Please enter the second y coordinate: ");
    y2[0] = Double.parseDouble(stdin.readLine());
    System.out.print("Please enter the third x coordinate: ");
    x3[0] = Double.parseDouble(stdin.readLine());
    System.out.print("Please enter the third y coordinate: ");
    y3[0] = Double.parseDouble(stdin.readLine());
    }

    static double slopeM (double []x1,double[]x2,double[]y1,double[]y2, double[] slope) 
    {
    slope [0] = (y2[0] - y1[0])/(x2[0]-x1[0]);
    return slope[0];
    }
    static void answer (double[] slope1,double[] slope2)
    {
    if((slope1[0])*(slope2[0]) == -1)
    {
    System.out.print("Your triangle is a right-angled triangle");
    }
    }
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");
	

	double[] x1 = new double [1];
	double[] y1 = new double[1];
	double[] x2 = new double [1];
	double[] y2 = new double [1];
	double[] x3 = new double[1];
	double[] y3 = new double[1];
	double[] slope1 = new double[1];
	double[] slope2 = new double[1];
	double[] slope3 = new double[1];
	
	input(x1,x2,x3,y1,y2,y3);
	slopeM(x1,x2,y1,y2,slope1);
	slopeM(x2,x3,y1,y3,slope2);
	slopeM(x3,x1,y3,y1,slope3);
	answer(slope1,slope2);
	answer(slope2,slope3);
	answer(slope3,slope1);
	
	
    }
}

