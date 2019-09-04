import cn.makinnet.thread.OrderOvertimeHandleThread;

public class app {
    public static void main(String[] args){
        System.out.println("hello world!");
        OrderOvertimeHandleThread oht = new OrderOvertimeHandleThread();


        new Thread(oht).start();

        System.out.println("I'm running before thread's ending.");
    }
}
