package Servlet;

import quickconnect.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet", urlPatterns = {"/Test"})
public class Servlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try
        {
            String path = "C:output.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream testout = new JSONOutputStream(fileOut);
            JSONInputStream testIn = new JSONInputStream(fileIn);
            
            ArrayList<String> list=new ArrayList<String>();

            list.add("Test");
            testout.writeObject(list);
            testout.close();
            JSONOutputStream outToWeb =  new JSONOutputStream(response.getOutputStream());
            outToWeb.writeObject(list);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        doPost(request,response);
    }
}