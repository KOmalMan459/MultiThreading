package MultiThreading;


class Tablea{
    public synchronized void printTable(int n){
        for(int i =1;i<=10;i++){
            System.out.println(n*i);
        }
        try{
            Thread.sleep(200);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

class Tables extends Thread{
    Tablea t;
    Tables(Tablea t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Tablec extends Thread{
    Tablea t;
    Tablec(Tablea t){
        this.t=t;
    }
    public void run(){
        t.printTable(15);
    }
}

public class Table {
    public static void main(String[] args) {
        Tablea t1= new Tablea();
        Tables s1=new Tables(t1);
        s1.start();
        Tablec c1=new Tablec(t1);
        c1.start();
    }
    
}
