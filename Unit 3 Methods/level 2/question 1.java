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
	double i, f;
	
	for(i=50;i<=65;i++)
	{
	f = CentigradetoFahrenheit(i);
	System.out.println("Celcius\tFarenheit");
	System.out.println(i+"\t" + f + "\t");
	}
    }
}

