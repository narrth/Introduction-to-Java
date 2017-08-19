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
    static double CentigradetoFahrenheit (double Centigrade)
    {
    double CentigradetoFahrenheit;
    CentigradetoFahrenheit = (9 / 5) * (Centigrade + 32);
    return CentigradetoFahrenheit;
    }
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");

	double Centigrade, Fahrenheit;
	System.out.print("Please enter the nuber of degrees celsius you would like to convert: ");
	Centigrade = Double.parseDouble(stdin.readLine());
	System.out.print("Your answer in degrees Fahrenheit is " + df.format(Fahrenheit = CentigradetoFahrenheit (Centigrade))); 
    }
}

