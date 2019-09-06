package cn.makinnet.thread;

public class SingleThread implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */

    private Thread t;
    private String threadName;

    public SingleThread(String threadName){
        this.threadName = threadName;
        System.out.println("creating thread " + threadName);
    }

    @Override
    public void run() {
        try {
            int n=3;
            do {
                n--;
                System.out.println(String.format("thread name is %s, remain %d round.", threadName, n));
                Thread.sleep(500);
            }while (n>0);

        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("start running thread " + threadName);
        if (t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
