package MultiThreading;

public class Priority {
    public static void main(String[] args) {
        K k1=new K();
        L l1=new L();
        M m1=new M();

        k1.setPriority(Thread.MIN_PRIORITY);
        l1.setPriority(Thread.NORM_PRIORITY);
        m1.setPriority(Thread.MAX_PRIORITY);

        k1.start();
        l1.start();
        m1.start();
    }
    
}

class K extends Thread{
    public void run(){
        System.out.println("Thread of K Priority is:"+getPriority());
    }
}
class L extends Thread{
    public void run(){
        System.out.println("Thread of L Priority is:"+getPriority());
    }
}
class M extends Thread{
    public void run(){
        System.out.println("Thread of M Priority is:"+getPriority());
    }
}
