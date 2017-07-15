package javaCollections;

import java.util.ArrayList;

public class JavaCollectionsList 
{
public static void createList()
{
	ArrayList<String> array = new ArrayList<String>();
	
	array.add("Superman");
	array.add("Aquaman");
	array.add("Batman");
	array.add("WonderWoman");
	
	System.out.println("Our array is currently " + array.size() + " long\n"); 
	
	System.out.println("Here's what's in the list: " + array + "\n");
	
	
	System.out.println("Let's replace position 2 with Iceman\n");
	array.add(2, "Iceman");
	System.out.println("Here's what's in the list: " + array + "\n");
	
	System.out.println("Let's remove WonderWoman from the list\n");
	array.remove("WonderWoman");
	System.out.println("Here's what's in the list: " + array + "\n");
}
}