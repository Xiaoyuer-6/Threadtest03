package threadcreate;

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-17
 * Time: 20:57
 * 创建线程的方法六：实现Callable接口+Future的方式（创建并得到线程的执行结果）
 */
public class ThreadDemo9 {
    static class Mycallable implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            int num =new Random().nextInt(10);
            System.out.println("子线程名称:"+Thread.currentThread().getName()+",随机数"+num);
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mycallable mycallable = new Mycallable();
        //创建一个FutureTask对象来接受返回值
        FutureTask<Integer> futureTask = new FutureTask<>(mycallable);
        Thread thread = new Thread(futureTask);
        thread.start();
         int result  = futureTask.get();
        System.out.println(String.format("线程名,%s，数字:%d",Thread.currentThread().getName(),result));

    }
}
