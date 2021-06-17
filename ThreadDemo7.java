package threadcreate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-17
 * Time: 20:45
 * 创建线程的方法四，实现Runnable接口
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名称："+Thread.currentThread().getName());
            }
        });
        thread.start();
    }
}
