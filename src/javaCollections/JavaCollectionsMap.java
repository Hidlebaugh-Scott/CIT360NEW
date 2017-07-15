package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class JavaCollectionsMap 
{

public static void createMap() 
{

   Map<String, Integer> map = new HashMap<String, Integer>();

   map.put("Apples", 50);
   map.put("Oranges", 15);
   map.put("Pears", 5);

   System.out.println("There are " + map.size() + " items in total.");

   String key = "Oranges";

   System.out.println("There are " + map.get(key) + " " + key + " items.");
   System.out.println("\n");
   
   if (map.containsKey(key))
   {
       System.out.println(key + " is a key in this map.");
   } else
   {
       System.out.println(key + " is not a key in this map.");
   }
   
   
   if (map.containsValue(15))
   {
       System.out.println("15 is a value in this map.");
   } else
   {
       System.out.println("15 is not a value in this map.");
   }

   if (map.isEmpty()){
       System.out.println("This map is empty.");
   } else{
       System.out.println("This map is not empty.");
   }

   map.remove("Pears");

   System.out.println("There are " + map.size() + " items in total.");

   map.clear();

   System.out.println("There are " + map.size() + " items in total.");

}

}