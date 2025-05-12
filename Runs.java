package MultiThreading;

public class Runs {
    public static void main(String[] args) {
        RunA ao=new RunA();
        RunB bo=new RunB();
        RunC co=new RunC();

        Thread t1=new Thread(ao);
        t1.start();
        Thread t2=new Thread(bo);
        t2.start();
        Thread t3=new Thread(co);
        t3.start();
    }
}

class RunA implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("A.."+i);
        }
    }  
}

class RunB implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("B.."+i);
        }
    }  
}

class RunC implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("c.."+i);
        }
    }  
}
