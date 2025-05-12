package MultiThreading;

public class Deamon extends Thread{
    //background thread

    @Override
    public void run()
    {
        while(true){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        Deamon d1= new Deamon();
        d1.setDaemon(true);
        d1.start();
        System.out.println("Main Done");

    }
    
    
}
