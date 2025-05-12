package MultiThreading;

public class Lockmain {
    public static void main(String[] args){
        Locking b=new Locking();
        Runnable task=  new Runnable(){
            @Override
            public void run(){
                b.withdraw(50);
            }
        };

        Thread t1= new Thread(task,"Thread 1");
         Thread t2= new Thread(task,"Thread 2");

         t1.start();
         t2.start();
    }
    
}
