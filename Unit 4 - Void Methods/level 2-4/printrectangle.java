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
    static void printRectangle (int legnth, char symbol, int height)
    {
    int repeat1, repeat2;
    for(repeat1 = 0;repeat1<height;repeat1++)
    {
    System.out.print("\n");
    for(repeat2 = 0; repeat2<legnth;repeat2++)
    {
    System.out.print(symbol);
    }
    }
    }
    
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");
	int legnth, height;
	char symbol;
	
	System.out.print("What would you like to be your symbol: ");
	symbol = stdin.readLine().charAt(0);
	System.out.print("What would you like to be the legnth of the rectangle: ");
	legnth = Integer.parseInt(stdin.readLine());
	System.out.print("What would you like to the the height of the rectangle: ");
	height = Integer.parseInt(stdin.readLine());
	
	printRectangle (legnth, symbol, height);
    }
}

