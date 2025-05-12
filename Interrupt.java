package MultiThreading;

public class Interrupt extends Thread{
    public void run()
    {
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        }catch(InterruptedException e){
        System.out.println("Thread interrupted:"+e);
        }
    }


    public static void main(String[] args) {
        Interrupt i = new Interrupt();
        i.start();
        i.interrupt();
    }
    
}

//yield method -- gives chance to others threads toS 