/*--------------------------------------------------------------------------------------*/
/*  excersize1.java  -  Description                                                       */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:  Narrthanan Seevananthan                                                    */
/*  Date:    sept 22                                                                    */
/*--------------------------------------------------------------------------------------*/
/*  Input:                                                                              */
/*  Output:                                                                             */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class Review1
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
int number1, number2;
int sum, difference, product, quotient, remainder;

Random generator = new Random();

int r = generator.nextInt(10);
int r2 = generator.nextInt(10);


sum = r + r2;
difference = r - r2;
product = r * r2;
quotient= r / r2;
remainder = r % r2;

System.out.println ();
System.out.println ("The first number is " + r);
System.out.println ("The second number is " +r2);
System.out.println ("The sum of " + r + " and " + r2 + " is: " + sum);
System.out.println ("The difference of " + r + " and " + r2 + " is: " + difference);
System.out.println ("The product of " + r + " and " + r2 + " is: " + product);
System.out.println ("The quotient of " + r + " and " + r2 + " is: " + quotient);
System.out.println ("The remainder of " + r + " and " + r2 + " is: " + remainder);

    }
}

