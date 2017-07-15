package javaCollections;

import java.util.HashSet;

public class JavaCollectionsSet 
{
public static void createSet()
{
		HashSet<String> set = new HashSet<String>();
		
		set.add("Wolverine");
		set.add("Iron Man");
		set.add("Cyclops");
		set.add("Professor X");
		
		System.out.println("First we'll check if it's empty");
		System.out.println("Our set is empty = " + set.isEmpty() + "\n");
		
		System.out.println("Our set is currently " + set.size() + " long\n"); 
		
		System.out.println("Here's what's in the list: " + set + "\n");
		
		System.out.println("Let's copy the set");
		HashSet<String> clone = new HashSet<String>();
		clone=(HashSet)set.clone();
		System.out.println("Here our cloned set: " + clone + "\n");
		
		System.out.println("Let's drop Cyclops");
		set.remove("Cyclops");
		System.out.println("Here's what's in the list: " + set + "\n");
		
}
}