package URLConnection;

import java.net.*;
import java.io.*;

public class URLConnect 
{

        public static void main(String[] args) throws IOException 
        {

            URLConnect http =new URLConnect();

            //Create valid connection
            URL ford = new URL("http://www.ford.com/");
            URLConnection conn = ford.openConnection();
            BufferedReader buf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = buf.readLine();
            while (s != null)
            {
                System.out.println(s);
                s = buf.readLine();
            }

            //Create invalid connection
            try 
            {
                URL ford2 = new URL("http://www.ford.com/chevyisthebest");
                URLConnection conn2 = ford2.openConnection();
                BufferedReader buf2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
                String s2 = buf2.readLine();
                while (s2 != null) 
                {
                    System.out.println(s2);
                    s2 = buf2.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: Page does not exist\n");
            }

            //Try fake
            try 
            {
                URL ford3 = new URL("www.ofrd.com");
                URLConnection conn3 = ford3.openConnection();
                BufferedReader buf3 = new BufferedReader(new InputStreamReader(conn3.getInputStream()));
                String s3 = buf3.readLine();
                while (s3 != null) 
                {
                    System.out.println(s3);
                    s3 = buf3.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: Invalid URL\n");
            }



        }


}
