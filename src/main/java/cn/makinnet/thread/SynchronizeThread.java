package cn.makinnet.thread;


public class SynchronizeThread implements Runnable {

    private int count = 10;

    @Override
    public void run() {
        System.out.println("start running...");

        while(this.get_count() > 0){
            this.reduce_count();
            System.out.println("I'm "+ Thread.currentThread().getName() +" remain...count..." + this.get_count());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end running...");
    }

    private synchronized int get_count(){
        return this.count;
    }

    private synchronized void reduce_count(){
        this.count--;
    }
}


