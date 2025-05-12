package MultiThreading;

public class Threading {
    public static void main(String[] args) {
       
        System.out.println("Main Threads Starts");
        E e1=new E();
        F f1=new F();
        G g1=new G();

        e1.start();
        f1.start();
        g1.start();

        try{
            e1.join();
            f1.join();
            g1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Main Thread Ends");
    }
    
}
class E extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("E"+i);
        }
    }
}
class F extends Thread{
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.println("F"+i);
        }
    }
}
class G extends Thread{
    public void run(){
        for(int i=21;i<=30;i++){
            System.out.println("G"+i);
        }
    }
}
