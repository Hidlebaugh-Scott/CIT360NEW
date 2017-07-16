package qcjson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import quickconnect.*;

public class Driver 
{
    public static void main(String[] args)
    {

        // parsing a string

        try 
        {
            String name = "{\"My name is\":\"Scott Hidlebaugh\"}";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

       // Will fail since JSON format is expected
       try 
        {
            String name = "My name is:Scott Hidlebaugh";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

       //Empty JSON created
        try 
        {
            String name = "{}";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        //Can store null values
        try 
        {
            String name = null;
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e){
            e.printStackTrace();
        }


        
    }
}