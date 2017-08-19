/*--------------------------------------------------------------------------------------*/
/*  Summative.java  -  Summativeproject created for computer science class. It is able to create, delete, sort, search, display, add to, and back up ".txt" files */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Narrthanan Seevananthan                                                     */
/*  Date: April 27, 2012                                                                */
/*--------------------------------------------------------------------------------------*/
/*  Input: Name of user(s), ".txt" mp3 collection, switch responses, and Song information */
/*  Output: ".txt" mp3 collection, switch options                                       */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;
//declare the class
public class Summative
{
    //Void method created to display everything in the array onto the scrren
    static void DisplayCollection (String name, String[] Sinfo) throws IOException
    {
	//declaring my variables
	String line = null;
	int count = 0;
	//opening the ".txt" file
	BufferedReader reader = new BufferedReader (new FileReader (name + ".txt"));
	//Spacer
	System.out.println ("---------------------------------------------------------------------------");
	//Loop to run through the variable and display its contents
	while ((line = reader.readLine ()) != null)
	{
	    Sinfo [count] = line;
	    System.out.println (line);
	    count++;
	}
	reader.close ();
	//spacer
	System.out.println ("---------------------------------------------------------------------------");
    }


    //Void method to add songs into the database
    static void AddToCollection (String name, String[] Sinfo) throws IOException
    {

	//Declaring variables
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	String line = null;
	int count = 0;
	int count2 = 0;
	String Sname, artist, category, year, rating;
	//Spacer & loop to read database into an array and re-write it
	System.out.println ("---------------------------------------------------------------------------");

	BufferedReader reader = new BufferedReader (new FileReader (name + ".txt"));
	while ((line = reader.readLine ()) != null)
	{
	    Sinfo [count] = line;
	    count++;
	}
	reader.close ();
	BufferedWriter writer = new BufferedWriter (new FileWriter (name + ".txt"));
	while (Sinfo [count2] != null)
	{
	    line = Sinfo [count2];
	    writer.write (line);
	    writer.newLine ();
	    count2++;
	}
	//ask for user input and write that into the array aswell
	System.out.println ("Please enter the Song's title: ");
	name = stdin.readLine ();
	System.out.println ("Please enter the Artist's name: ");
	artist = stdin.readLine ();
	System.out.println ("Please enter the Category the song falls under: ");
	category = stdin.readLine ();
	System.out.println ("Please enter the year the song was released: ");
	year = stdin.readLine ();
	System.out.println ("Please enter your personal rating for the song (out of 10): ");
	rating = stdin.readLine ();
	writer.write ("Song: " + name);
	writer.newLine ();
	writer.write ("Artist: " + artist);
	writer.newLine ();
	writer.write ("Category: " + category);
	writer.newLine ();
	writer.write ("Release year: " + year);
	writer.newLine ();
	writer.write ("Rating(/10): " + rating);
	writer.newLine ();
	writer.close ();
	//spacer
	System.out.println ("---------------------------------------------------------------------------");
    }


    //Void method to search for a song within the database
    public static void search (String Sinfo[], String name) throws IOException
    {
	//declaring variables
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	BufferedReader reader = new BufferedReader (new FileReader (name + ".txt"));
	String line = null;
	int count = 0;
	int count2;
	int response;
	int count3 = 0;
	String search;
	//reading the database into an array and a switch statement to ask the user the preference of searching through each category
	while ((line = reader.readLine ()) != null)
	{

	    Sinfo [count] = line;

	    count++;
	}
	reader.close ();
	//spacer
	System.out.println ("---------------------------------------------------------------------------");
	System.out.println ("Would you like to search by : \n[1] name \n[2] artist \n[3] category\n[4] Release year \n[5] rating");
	response = Integer.parseInt (stdin.readLine ());
	//Asks for user input to search for within the certain category
	switch (response)
	{
	    case 1:
		{

		    System.out.println ("Please enter the song name you wish to search for: ");
		    search = stdin.readLine ();
		    //for loop to check the entire array and if found display it along with the entry number
		    for (count2 = 0 ; count2 < count ; count2++)
		    {
			if (Sinfo [count2].equals ("Song: " + search))
			{
			    System.out.println (Sinfo [count2]);
			    System.out.println (Sinfo [count2 + 1]);
			    System.out.println (Sinfo [count2 + 2]);
			    System.out.println (Sinfo [count2 + 3]);
			    System.out.println (Sinfo [count2 + 4]);
			    System.out.println ("This enty is entry number: " + (count2 / 5));
			}
			else
			{
			    count3++;
			}
		    }
		    //if it isn't found tell the user
		    if (count3 == count)
		    {
			System.out.println ("What you are searching for is not found within the database");
		    }
		    break;
		}

	    case 2:
		{
		    System.out.println ("Please enter the artist name you wish to search for: ");
		    search = stdin.readLine ();
		    //for loop to check the entire array and if found display it along with the entry number
		    for (count2 = 0 ; count2 < count ; count2++)
		    {
			if (Sinfo [count2].equals ("Artist: " + search))
			{
			    System.out.println (Sinfo [count2 - 1]);
			    System.out.println (Sinfo [count2]);
			    System.out.println (Sinfo [count2 + 1]);
			    System.out.println (Sinfo [count2 + 2]);
			    System.out.println (Sinfo [count2 + 3]);
			    System.out.println ("This enty is entry number: " + (count2 / 5));
			}
			else
			{
			    count3++;
			}
		    }
		    //if it isn't found tell the user
		    if (count3 == count)
		    {
			System.out.println ("What you are searching for is not found within the database");
		    }
		    break;
		}
	    case 3:
		{
		    System.out.println ("Please enter the category name you wish to search for: ");
		    search = stdin.readLine ();
		    //for loop to check the entire array and if found display it along with the entry number
		    for (count2 = 0 ; count2 < count ; count2++)
		    {
			if (Sinfo [count2].equals ("Category: " + search))
			{
			    System.out.println (Sinfo [count2 - 2]);
			    System.out.println (Sinfo [count2 - 1]);
			    System.out.println (Sinfo [count2]);
			    System.out.println (Sinfo [count2 + 1]);
			    System.out.println (Sinfo [count2 + 2]);
			    System.out.println ("This enty is entry number: " + (count2 / 5));
			}
			else
			{
			    count3++;
			}
		    }
		    //if it isn't found tell the user
		    if (count3 == count)
		    {
			System.out.println ("What you are searching for is not found within the database");
		    }
		    break;
		}
	    case 4:
		{
		    System.out.println ("Please enter the release year you wish to search for: ");
		    search = stdin.readLine ();
		    //for loop to check the entire array and if found display it along with the entry number
		    for (count2 = 0 ; count2 < count ; count2++)
		    {
			if (Sinfo [count2].equals ("Release year: " + search))
			{
			    System.out.println (Sinfo [count2 - 3]);
			    System.out.println (Sinfo [count2 - 2]);
			    System.out.println (Sinfo [count2 - 1]);
			    System.out.println (Sinfo [count2]);
			    System.out.println (Sinfo [count2 + 1]);
			    System.out.println ("This enty is entry number: " + (count2 / 5));
			}
			else
			{
			    count3++;
			}
		    }
		    //if it isn't found tell the user
		    if (count3 == count)
		    {
			System.out.println ("What you are searching for is not found within the database");
		    }
		    break;
		}
	    case 5:
		{
		    System.out.println ("Please enter the rating you wish to search for: ");
		    search = stdin.readLine ();
		    //for loop to check the entire array and if found display it along with the entry number
		    for (count2 = 0 ; count2 < count ; count2++)
		    {
			if (Sinfo [count2].equals ("Rating(/10): " + search))
			{
			    System.out.println (Sinfo [count2 - 4]);
			    System.out.println (Sinfo [count2 - 3]);
			    System.out.println (Sinfo [count2 - 2]);
			    System.out.println (Sinfo [count2 - 1]);
			    System.out.println (Sinfo [count2]);
			    System.out.println ("This enty is entry number: " + (count2 / 5));
			}
			else
			{
			    count3++;
			}
		    }
		    //if it isn't found tell the user
		    if (count3 == count)
		    {
			System.out.println ("What you are searching for is not found within the database");
		    }
		    break;
		}

	}
	//Display the total number of entries along with a spacer
	System.out.println ("There are " + (count / 5) + " entries entered into the database.");
	System.out.println ("---------------------------------------------------------------------------");
    }





    //Void method used for sorting within the array
    public static void sort (String Sinfo[], String name) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	//Declare variables
	String line = null;
	int count = 0;
	String temp;
	int i, j, count2, response3;
	String[] nameI = new String [99999];
	String[] artist = new String [99999];
	String[] category = new String [99999];
	String[] year = new String [99999];
	String[] rating = new String [99999];
	BufferedReader reader = new BufferedReader (new FileReader (name + ".txt"));
	//read the datbase into multiple arrays
	while ((line = reader.readLine ()) != null)
	{
	    nameI [count] = line;

	    line = reader.readLine ();
	    artist [count] = line;

	    line = reader.readLine ();
	    category [count] = line;

	    line = reader.readLine ();
	    year [count] = line;

	    line = reader.readLine ();
	    rating [count] = line;


	    count++;
	}
	//Display a spacer and ask user what they would like to sort by
	reader.close ();
	System.out.println ("---------------------------------------------------------------------------");
	System.out.println ("Would you like to sort by : \n[1] name \n[2] artist \n[3] category\n[4] year \n[5] rating");
	response3 = Integer.parseInt (stdin.readLine ());
	//For each category compare the array value with the one after it if it is greater swap it with that one using modified bs, if nothing is swapped
	//then display it to the user, if two values are the same compare the songs name. Repeat for each category,
	switch (response3)
	{
	    case 1:
		{
		    for (i = 0 ; i < count - 1 ; i++)
		    {
			boolean swapped = false;
			for (j = 0 ; j < count - 1 - i ; j++)
			{

			    if ((nameI [j].compareTo (nameI [j + 1])) > 0)
			    {

				temp = nameI [j];
				nameI [j] = nameI [j + 1];
				nameI [j + 1] = temp;
				temp = artist [j];
				artist [j] = artist [j + 1];
				artist [j + 1] = temp;
				temp = category [j];
				category [j] = category [j + 1];
				category [j + 1] = temp;
				temp = year [j];
				year [j] = year [j + 1];
				year [j + 1] = temp;
				temp = rating [j];
				rating [j] = rating [j + 1];
				rating [j + 1] = temp;


				swapped = true;

			    }


			}
			if (swapped = false)
			{
			    i = count - 2;
			}
		    }
		    break;
		}
	    case 2:
		{
		    for (i = 0 ; i < count - 1 ; i++)
		    {
			boolean swapped = false;
			for (j = 0 ; j < count - 1 - i ; j++)
			{

			    if ((artist [j].compareTo (artist [j + 1])) > 0)
			    {

				temp = nameI [j];
				nameI [j] = nameI [j + 1];
				nameI [j + 1] = temp;
				temp = artist [j];
				artist [j] = artist [j + 1];
				artist [j + 1] = temp;
				temp = category [j];
				category [j] = category [j + 1];
				category [j + 1] = temp;
				temp = year [j];
				year [j] = year [j + 1];
				year [j + 1] = temp;
				temp = rating [j];
				rating [j] = rating [j + 1];
				rating [j + 1] = temp;


				swapped = true;

			    }
			    if (artist [j].equals (artist [j + + 1]))
			    {
				if ((nameI [j].compareTo (nameI [j + 1])) > 0)
				{
				    temp = nameI [j];
				    nameI [j] = nameI [j + 1];
				    nameI [j + 1] = temp;
				    temp = artist [j];
				    artist [j] = artist [j + 1];
				    artist [j + 1] = temp;
				    temp = category [j];
				    category [j] = category [j + 1];
				    category [j + 1] = temp;
				    temp = year [j];
				    year [j] = year [j + 1];
				    year [j + 1] = temp;
				    temp = rating [j];
				    rating [j] = rating [j + 1];
				    rating [j + 1] = temp;

				    swapped = true;
				}
			    }


			}
			if (swapped = false)
			{
			    i = count - 2;
			}
		    }
		    break;
		}
	    case 3:
		{
		    for (i = 0 ; i < count - 1 ; i++)
		    {
			boolean swapped = false;
			for (j = 0 ; j < count - 1 - i ; j++)
			{
			    if ((category [j].compareTo (category [j + 1])) > 0)
			    {
				temp = nameI [j];
				nameI [j] = nameI [j + 1];
				nameI [j + 1] = temp;
				temp = artist [j];
				artist [j] = artist [j + 1];
				artist [j + 1] = temp;
				temp = category [j];
				category [j] = category [j + 1];
				category [j + 1] = temp;
				temp = year [j];
				year [j] = year [j + 1];
				year [j + 1] = temp;
				temp = rating [j];
				rating [j] = rating [j + 1];
				rating [j + 1] = temp;

				swapped = true;
			    }
			    if (category [j].equals (category [j + 1]))
			    {
				if ((nameI [j].compareTo (nameI [j + 1])) > 0)
				{
				    temp = nameI [j];
				    nameI [j] = nameI [j + 1];
				    nameI [j + 1] = temp;
				    temp = artist [j];
				    artist [j] = artist [j + 1];
				    artist [j + 1] = temp;
				    temp = category [j];
				    category [j] = category [j + 1];
				    category [j + 1] = temp;
				    temp = year [j];
				    year [j] = year [j + 1];
				    year [j + 1] = temp;
				    temp = rating [j];
				    rating [j] = rating [j + 1];
				    rating [j + 1] = temp;

				    swapped = true;
				}
			    }


			}
			if (swapped = false)
			{
			    i = count - 2;
			}
		    }
		    break;
		}
	    case 4:
		{
		    for (i = 0 ; i < count - 1 ; i++)
		    {
			boolean swapped = false;
			for (j = 0 ; j < count - 1 - i ; j++)
			{
			    if ((year [j].compareTo (year [j + 1])) > 0)
			    {
				temp = nameI [j];
				nameI [j] = nameI [j + 1];
				nameI [j + 1] = temp;
				temp = artist [j];
				artist [j] = artist [j + 1];
				artist [j + 1] = temp;
				temp = category [j];
				category [j] = category [j + 1];
				category [j + 1] = temp;
				temp = year [j];
				year [j] = year [j + 1];
				year [j + 1] = temp;
				temp = rating [j];
				rating [j] = rating [j + 1];
				rating [j + 1] = temp;
				swapped = true;
			    }
			    if (year [j].equals (year [j + 1]))
			    {
				if ((nameI [j].compareTo (nameI [j + 1])) > 0)
				{
				    temp = nameI [j];
				    nameI [j] = nameI [j + 1];
				    nameI [j + 1] = temp;
				    temp = artist [j];
				    artist [j] = artist [j + 1];
				    artist [j + 1] = temp;
				    temp = category [j];
				    category [j] = category [j + 1];
				    category [j + 1] = temp;
				    temp = year [j];
				    year [j] = year [j + 1];
				    year [j + 1] = temp;
				    temp = rating [j];
				    rating [j] = rating [j + 1];
				    rating [j + 1] = temp;

				    swapped = true;
				}
			    }

			}
			if (swapped = false)
			{
			    i = count - 2;
			}
		    }
		    break;
		}
	    case 5:
		{
		    for (i = 0 ; i < count - 1 ; i++)
		    {
			boolean swapped = false;
			for (j = 0 ; j < count - 1 - i ; j++)
			{
			    if ((rating [j].compareTo (rating [j + 1])) > 0)
			    {
				temp = nameI [j];
				nameI [j] = nameI [j + 1];
				nameI [j + 1] = temp;
				temp = artist [j];
				artist [j] = artist [j + 1];
				artist [j + 1] = temp;
				temp = category [j];
				category [j] = category [j + 1];
				category [j + 1] = temp;
				temp = year [j];
				year [j] = year [j + 1];
				year [j + 1] = temp;
				temp = rating [j];
				rating [j] = rating [j + 1];
				rating [j + 1] = temp;
				swapped = true;
			    }
			    if (rating [j].equals (rating [j + 1]))
			    {
				if ((nameI [j].compareTo (nameI [j + 1])) > 0)
				{
				    temp = nameI [j];
				    nameI [j] = nameI [j + 1];
				    nameI [j + 1] = temp;
				    temp = artist [j];
				    artist [j] = artist [j + 1];
				    artist [j + 1] = temp;
				    temp = category [j];
				    category [j] = category [j + 1];
				    category [j + 1] = temp;
				    temp = year [j];
				    year [j] = year [j + 1];
				    year [j + 1] = temp;
				    temp = rating [j];
				    rating [j] = rating [j + 1];
				    rating [j + 1] = temp;

				    swapped = true;
				}
			    }

			}
			if (swapped = false)
			{
			    i = count - 2;
			}
		    }
		    break;
		}
	    default:
		{
		    //telling the user they have made a mistake
		    System.out.println ("You have done something wrong please try again.");
		    break;
		}

	}
	//display a spacer and the sorted array.Write the new sorted array into the database and display another spacer
	System.out.println ("---------------------------------------------------------------------------");
	BufferedWriter writer = new BufferedWriter (new FileWriter (name + ".txt"));
	System.out.println ();
	System.out.println ("The collection in order is: ");
	for (i = 0 ; i < count ; i++)
	{
	    writer.write (nameI [i]);
	    writer.newLine ();
	    System.out.println (nameI [i]);
	    writer.write (artist [i]);
	    writer.newLine ();
	    System.out.println (artist [i]);
	    writer.write (category [i]);
	    writer.newLine ();
	    System.out.println (category [i]);
	    writer.write (year [i]);
	    writer.newLine ();
	    System.out.println (year [i]);
	    writer.write (rating [i]);
	    writer.newLine ();
	    System.out.println (rating [i]);

	}


	writer.close ();
	System.out.println ("---------------------------------------------------------------------------");
    }


    //A Void method used to back up the database. Read the file into an array and rewrite it into a database named the same with the word backup added to it and display a spacer

    static void backup (String name, String[] Sinfo) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	String line = null;
	int count = 0;
	int count2 = 0;


	BufferedReader reader = new BufferedReader (new FileReader (name + ".txt"));
	while ((line = reader.readLine ()) != null)
	{
	    Sinfo [count] = line;
	    count++;
	}


	reader.close ();
	BufferedWriter writer = new BufferedWriter (new FileWriter (name + "backup" + ".txt"));
	while (Sinfo [count2] != null)
	{
	    line = Sinfo [count2];
	    writer.write (line);
	    writer.newLine ();
	    count2++;
	}


	writer.close ();
	System.out.println ("Your file has been backed up.");
	System.out.println ("---------------------------------------------------------------------------");
    }


    //A Void method used to delete entries within the database
    public static void delete (String[] Sinfo, String name) throws IOException
    {

	//Declare the variable used and open the txt file to read
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	BufferedReader reader = new BufferedReader (new FileReader (name + ".txt"));
	String line = null;
	int count = 0;
	int count2, response, i;
	int count3 = 0;
	String searchN, searchA, searchC, searchRY, searchR, temp;
	String[] nameI = new String [99999];
	String[] artist = new String [99999];
	String[] category = new String [99999];
	String[] year = new String [99999];
	String[] rating = new String [99999];
	boolean blank = false;
	//Display a spacer and read the database into multiple arrays
	System.out.println ("---------------------------------------------------------------------------");
	while ((line = reader.readLine ()) != null)
	{
	    nameI [count] = line;
	    line = reader.readLine ();
	    artist [count] = line;
	    line = reader.readLine ();
	    category [count] = line;
	    line = reader.readLine ();
	    year [count] = line;
	    line = reader.readLine ();
	    rating [count] = line;

	    count++;
	}
	reader.close ();
	//ask the user for the entry(s) they wish to delete
	System.out.println ("Please enter the song name you wish to delete: ");
	searchN = stdin.readLine ();
	System.out.println ("Please enter the artist name you wish to delete: ");
	searchA = stdin.readLine ();
	System.out.println ("Please enter the category name you wish to delete: ");
	searchC = stdin.readLine ();
	System.out.println ("Please enter the Release year you wish to delete: ");
	searchRY = stdin.readLine ();
	System.out.println ("Please enter the rating you wish to delete: ");
	searchR = stdin.readLine ();
	count = count - 1;
	//Use a for loop to go through the entire array
	for (count2 = 0 ; count2 < count ; count2++)
	{
	    //if the value to delete is equal to the last value in the array delete the entire last portion of the array
	    if ((nameI [count].equals ("Song: " + searchN)) && (artist [count].equals ("Artist: " + searchA)) && (category [count].equals ("Category: " + searchC)) &&
		    (year [count].equals ("Release year: " + searchRY)) && (rating [count].equals ("Rating(/10): " + searchR)))
	    {
		nameI [count] = null;
		artist [count] = null;
		category [count] = null;
		year [count] = null;
		rating [count] = null;
		count = count - 1;
		blank = true;
	    }
	    //if the current array value is equal to the value wished to be deleted save the last value into a temporary string variable and declare the last array value as
	    //null, then declare the current array value as the temporary value saved previously
	    if ((nameI [count2].equals ("Song: " + searchN)) && (artist [count2].equals ("Artist: " + searchA)) && (category [count2].equals ("Category: " + searchC)) &&
		    (year [count2].equals ("Release year: " + searchRY)) && (rating [count2].equals ("Rating(/10): " + searchR)))
	    {
		temp = nameI [count];
		nameI [count] = null;
		nameI [count2] = temp;

		temp = artist [count];
		artist [count] = null;
		artist [count2] = temp;

		temp = category [count];
		category [count] = null;
		category [count2] = temp;

		temp = year [count];
		year [count] = null;
		year [count2] = temp;

		temp = rating [count];
		rating [count] = null;
		rating [count2] = temp;

		count = count - 1;
		count2 = count2 - 1;
		blank = true;
	    }
	}
	//if the entry is not found and "blank" still equals false then display it to the user and display a spacer along with
	//writing the updated arrays into the database and displaying them with a spacer at the end
	if (blank = false)
	{
	    System.out.println ("What you want to delete is not found within the database");
	}
	System.out.println ("---------------------------------------------------------------------------");
	BufferedWriter writer = new BufferedWriter (new FileWriter (name + ".txt"));
	for (i = 0 ; i < count2 ; i++)
	{
	    writer.write (nameI [i]);
	    writer.newLine ();
	    System.out.println (nameI [i]);
	    writer.write (artist [i]);
	    writer.newLine ();
	    System.out.println (artist [i]);
	    writer.write (category [i]);
	    writer.newLine ();
	    System.out.println (category [i]);
	    writer.write (year [i]);
	    writer.newLine ();
	    System.out.println (year [i]);
	    writer.write (rating [i]);
	    writer.newLine ();
	    System.out.println (rating [i]);
	}
	writer.close ();
	System.out.println ("---------------------------------------------------------------------------");
    }



    public static void main (String str[]) throws IOException
    {
	//declaring my variables
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");
	final int MAX = 99999;
	int response, response1;
	String name, repeat, response2;
	String[] Sinfo = new String [MAX];
	repeat = "y";
	//              My Checklist
	//Your program should be able to do the following:
	//� Open and View the collection-done
	//� Add to the collection-done
	//� Search by: category, titles, artists-done
	//� Sort by: category, titles, artists-done
	//� Create a backup of the collection-done
	//� Delete a song from the collection-done
	//� Allow multiple users to create other databases as well-done

	//Ask the user if they are a returning user if not then create a new database for them, if yes then open thier old one with thier name as the title
	System.out.println ("Are you a returning user: \n[1] yes \n[2] no");
	response = Integer.parseInt (stdin.readLine ());
	switch (response)
	{
	    case 1:
		{
		    //asking for thie name to open up thier database along with displaying a spacer
		    System.out.println ("Please enter your name into the program");
		    name = stdin.readLine ();
		    System.out.println ("---------------------------------------------------------------------------");
		    do
		    {
			//Introducing the program and providing the user with the many option the program can perform
			System.out.println ("Hello This program will do one of the following: \n1.Open and View the collection\n2.Add to the collection\n3.Search by: category, titles, artists\n4.Sort by: category, titles, artists\n5.Create a backup of the collection\n6.Delete a song from the collection\n7.Exit the program");
			response1 = Integer.parseInt (stdin.readLine ());
			// In each case call upon the void mathod created to perform it's task
			switch (response1)
			{
			    case 1:
				{
				    DisplayCollection (name, Sinfo);
				    break;
				}
			    case 2:
				{
				    do
				    {
					AddToCollection (name, Sinfo);
					System.out.println ("Would you like to continue adding to the collection ?(Y/N) ");
					response2 = stdin.readLine ();
				    }
				    while ((response2.equals ("Y") || response2.equals ("y")))
					;

				    break;
				}
			    case 3:
				{
				    search (Sinfo, name);
				    break;
				}
			    case 4:
				{
				    sort (Sinfo, name);
				    break;
				}
			    case 5:
				{
				    backup (name, Sinfo);
				    break;
				}
			    case 6:
				{
				    delete (Sinfo, name);
				    break;
				}
			    case 7:
				{

				    repeat = "n";
				    break;
				}
			    default:
				{
				    System.out.println ("You have done something wrong please try again.");
				    break;
				}
			}

		    }
		    while (repeat.equals ("Y") || repeat.equals ("y"))
			;

		    break;
		}
	    case 2:
		{

		    //create a new database for the user other then that everything else is the same as the other option
		    System.out.println ("Please enter your name into the program");
		    name = stdin.readLine ();
		    BufferedWriter writer = new BufferedWriter (new FileWriter (name + ".txt"));
		    do
		    {
			System.out.println ("Hello This program will do one of the following: \n1.Open and View the collection\n2.Add to the collection\n3.Search by: category, titles, artists\n4.Sort by: category, titles, artists\n5.Create a backup of the collection\n6.Delete a song from the collection\n7.Exit the program");
			response1 = Integer.parseInt (stdin.readLine ());
			switch (response1)
			{
			    case 1:
				{
				    DisplayCollection (name, Sinfo);
				    break;
				}
			    case 2:
				{
				    do
				    {
					AddToCollection (name, Sinfo);
					System.out.println ("Would you like to continue adding to the collection ?(Y/N) ");
					response2 = stdin.readLine ();
				    }
				    while ((response2.equals ("Y") || response2.equals ("y")))
					;

				    break;
				}
			    case 3:
				{
				    search (Sinfo, name);
				    break;
				}
			    case 4:
				{
				    sort (Sinfo, name);
				    break;
				}
			    case 5:
				{
				    backup (name, Sinfo);
				    break;
				}
			    case 6:
				{
				    delete (Sinfo, name);
				    break;
				}
			    case 7:
				{

				    repeat = "n";
				    break;
				}
			    default:
				{
				    System.out.println ("You have done something wrong please try again.");
				    break;
				}
			}

		    }
		    while (repeat.equals ("Y") || repeat.equals ("y"))
			;
		    break;
		}

	    default:
		{
		    System.out.println ("You have done something wrong please try again.");
		    break;
		}


	}






    }
}


