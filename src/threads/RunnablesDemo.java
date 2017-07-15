package threads;


public class RunnablesDemo implements Runnable {

    public void run(){
        for (int i = 0; i < 3; i++){
            try{
                System.out.println("Display 9 Times");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    // change names
    public static void main(String[] args){
        for (int i = 0; i < 3; i++){
            RunnablesDemo testThread = new RunnablesDemo();
            Thread rerunnable = new Thread(testThread);



            rerunnable.start();

            // nasty path - trying to start the thread again throws an illegal thread state exception
            rerunnable.start();
        }
    }




}