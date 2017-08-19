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

public class printgraph
{
    static void printGraph (int legnth, char symbol)
    {
    double repeat;
    for(repeat = 0; repeat<legnth; repeat++)
    {
    System.out.print(symbol);
    }
    }
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat("#");
	int legnth;
	char symbol;

	System.out.print("Please enther the legnth of the bar: ");
	legnth =Integer.parseInt(stdin.readLine());
	System.out.print("Please enther the symobl you wish to use: ");
	symbol = stdin.readLine().charAt(0);
	
	printGraph(legnth, symbol);
	
    }
}

