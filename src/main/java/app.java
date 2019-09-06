import cn.makinnet.thread.SingleThread;
import cn.makinnet.thread.SynchronizeThread;

public class app {
    public static void main(String[] args){
        System.out.println("hello world!");
        SynchronizeThread oht = new SynchronizeThread();


        Thread t1 = new Thread(oht);
        t1.setName("synchronized thread t1");
        Thread t2 = new Thread(oht);
        t2.setName("synchronized thread t2");

        t1.start();
        t2.start();

        System.out.println("I'm running before thread's ending.");

        SingleThread st1 = new SingleThread("single thread 1");
        st1.start();

        SingleThread st2 = new SingleThread("single thread 2");
        st2.start();
    }
}
