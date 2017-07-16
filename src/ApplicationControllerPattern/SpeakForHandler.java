package ApplicationControllerPattern;

import java.util.HashMap;


public class SpeakForHandler implements Handler 
{
    public void handleIt(HashMap<String, Object> dataMap) 
    {
        try
        {
            System.out.println("just sent "+dataMap);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void useIt(HashMap<String, Object> data) 
    {

    }
}