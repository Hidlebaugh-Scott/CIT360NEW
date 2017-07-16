package ApplicationControllerPattern;

import java.util.HashMap;

public interface Handler 
{
    public void handleIt(HashMap<String, Object> data);
    public void useIt(HashMap<String, Object> data);
}