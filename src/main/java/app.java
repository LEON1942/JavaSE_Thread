import cn.makinnet.thread.OrderOvertimeHandleThread;

public class app {
    public static void main(String[] args){
        System.out.println("hello world!");
        OrderOvertimeHandleThread oht = new OrderOvertimeHandleThread();

        oht.run();
        System.out.println("i'm new.");
    }
}
