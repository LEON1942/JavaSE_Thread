import cn.makinnet.thread.OrderOvertimeHandleThread;

public class app {
    public static void main(String[] args){
        System.out.println("hello world!");
        OrderOvertimeHandleThread oht = new OrderOvertimeHandleThread();


        Thread t1 = new Thread(oht);
        t1.setName("t1");
        Thread t2 = new Thread(oht);
        t2.setName("t2");

        t1.start();
        t2.start();

        System.out.println("I'm running before thread's ending.");
    }
}
