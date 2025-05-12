package MultiThreading;

public class Sync{
    public static void main(String[] args) throws Exception{
        SyncA sc = new SyncA();
        SyncA sy = new SyncA();
        SyncA sn = new SyncA();

        sc.start();
        sy.start();
        sn.start();

    }
    
}


class SyncA extends Thread{
    public void run(){
    synchronized (Sync.class){
    
        System.out.println("We are learning..");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("MultiThreading..");
    }
}
}
