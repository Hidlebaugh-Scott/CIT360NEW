package javaCollections;

import java.util.Scanner;

public class JavaCollections 
{

   public static void main(String[] args) 
   {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Select one of the following. \n1 = Map \n2 = List \n3 = Set \n4 = Tree");

       Integer input = scanner.nextInt();
       scanner.close();
       switch (input) 
       {
           case 1:
               JavaCollectionsMap.createMap() ;
               break;
           case 2:
               JavaCollectionsList.createList();
               break;
           case 3:
               JavaCollectionsSet.createSet();
               break;
           default:
               System.out.println("Enter a valid option.");
               break;
       }


      

   }
}