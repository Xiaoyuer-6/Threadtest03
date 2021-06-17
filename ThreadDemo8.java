package threadcreate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-17
 * Time: 20:47
 * 创建线程的方法五，实现Runnable接口
 */

public class ThreadDemo8 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("线程名称"+Thread.currentThread().getName());
        });
        thread.start();
    }
}
