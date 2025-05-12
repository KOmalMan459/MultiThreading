package MultiThreading;

public class Mix extends Thread{
    public Mix(String Name)
    {
        super(Name);
    }
    
    @Override
    public void run(){
        System.out.println("Running");
        for(int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" - Priority: "+Thread.currentThread().getPriority()+" - Count :"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Mix t1 = new Mix("Low Priority");
        Mix t2 = new Mix("Medium Priority");
        Mix t3 = new Mix("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

       // t1.join();
    }

}
