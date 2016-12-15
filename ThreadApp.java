package threadapp;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread extends Thread{
        @Override
        public void run(){
        for(int c=0; c<10;c++){
          
            try {
                System.out.println(this.getName()+"value"+c);
                //System.out.print(" -> ");//print è metodo statico, non ha bisogno di definire con cosa si usa, per esempio t1.start...
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
           }
    }


public class ThreadApp {

    
    
    public static void main(String[] args) {
    
     MyThread t1 = new MyThread();
     t1.setName("Thread one");
     t1.start();//start e definito in Thread che viene ereditato da MyThread. metodo dinamico
    
    MyThread t2 = new MyThread();
     t2.setName("Thread two");
     t2.start();
     
    }
    
}
