package MultiThreading;

public class Bank{

    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw "+ amount);
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName() + " Proceeding with withdraw ");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            balance -=amount;
            System.out.println(Thread.currentThread().getName() + " Completed Withdrawal. \n Remaining Balance"+ balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
        }
      
    }
    
}
