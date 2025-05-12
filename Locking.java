package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Locking {
    
    private int balance= 100;

    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+ " Attempting to withdraw"+amount);
        try{
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
              if(balance >=amount){
                try{
                     System.out.println(Thread.currentThread().getName() + " Proceeding with withdraw ");
                     Thread.sleep(3000);
                     balance -= amount;
                      System.out.println(Thread.currentThread().getName() + " Completed withdrawal.\nRemaining Balance :"+balance);
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }finally{
                    lock.unlock();
                } 
            }else{
                System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock will try later");
                }
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
}
    

