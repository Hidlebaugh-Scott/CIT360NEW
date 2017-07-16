package ApplicationControllerPattern;

import java.util.HashMap;

public class Driver 
{
    public static void main(String[] args)
    {
        ApplicationController applicationController = new ApplicationController();

        applicationController.mapCommand("command1",new SpeakForHandler());
        applicationController.mapCommand("command2",new SpeakForHandler());

        String command1 = "command1";

        HashMap data = new HashMap();
        data.put("Superman","Super");
        data.put("Joker","Crazy");

        //Access with variable
        applicationController.handleRequest(command1,data);
        //Access with manual string
        applicationController.handleRequest("command2",data);
        //Fail access
        applicationController.handleRequest("no",data);

    }
}