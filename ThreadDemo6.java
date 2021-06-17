package threadcreate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-17
 * Time: 19:50
 * 创建线程的方法三：实现Runnable接口的方式
 */
public class ThreadDemo6 {
    static class  MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("线程名称："+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        //新建Runnable类
        MyRunnable runnable = new MyRunnable();
        //新建Thread类
        Thread thread = new Thread(runnable);
        //启动线程
        thread.start();
    }

}
