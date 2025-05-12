package MultiThreading;

public class Current {
    public static void main(String[] args) {
        System.out.println("Default Name is:"+Thread.currentThread().getName());
        Thread.currentThread().setName("Test");
        System.out.println("Updated Name is:"+Thread.currentThread().getName());

            H h1=new H();
            I i1=new I();
            J j1=new J();

            h1.start();
            i1.start();
            j1.start();
    }
}
class H extends Thread{
     public void run(){
         System.out.println("Default Name of H is:"+Thread.currentThread().getName());
         Thread.currentThread().setName("H");
         System.out.println("Updated Name of H is:"+Thread.currentThread().getName());

     }
}

class I extends Thread{
     public void run(){
         System.out.println("Default Name of I is:"+Thread.currentThread().getName());
         Thread.currentThread().setName("I");
         System.out.println("Updated Name of I is:"+Thread.currentThread().getName());

     }
}

class J extends Thread{
     public void run(){
         System.out.println("Default Name of J is:"+Thread.currentThread().getName());
         Thread.currentThread().setName("J");
         System.out.println("Updated Name of J is:"+Thread.currentThread().getName());

     }
}
