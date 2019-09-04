package cn.makinnet.thread;


public class OrderOvertimeHandleThread implements Runnable {
    private Thread thread;
    private String name;



    @Override
    public void run() {
        System.out.println("start running...");
        for(int i=0;i<5;i++){
            System.out.println("I'm running...round..."+(i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end running...");
    }

    public void start(){
        System.out.println("start running...");
        for(int i=0;i<5;i++){
            System.out.println("I'm running...round..."+(i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end running...");

    }
}