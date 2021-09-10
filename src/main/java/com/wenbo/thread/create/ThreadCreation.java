package com.wenbo.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
/**
 * @author: liwenbo
 * @date: 2021-09-10 08:59:12
 * 
 * @desc: 线程创建
 */
//方式一
class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

// 方式二
class RunnableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

// 方式三
class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            sum += i;
        }
        return sum;
    }

}

// 方式四
class ThreadPool implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}

public class ThreadCreation {
    public static void main(String[] args) {
        // 继承Thread
        ThreadTest thread = new ThreadTest();
        thread.setName("方式一");
        thread.start();

        // 实现Runnable
        RunnableTest runnableTest = new RunnableTest();
        Thread thread2 = new Thread(runnableTest, "方式二");
        thread2.start();

        // 实现Callable<> 有返回值
        CallableTest callableTest = new CallableTest();
        FutureTask<Integer> futureTask = new FutureTask<>(callableTest);
        new Thread(futureTask, "方式三").start();
        // 返回值
        try {
            Integer integer = futureTask.get();
            System.out.println("返回值（sum）：" + integer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) pool;
        /*
         * 可以做一些操作:
         * corePoolSize：核心池的大小
         * maximumPoolSize：最大线程数
         * keepAliveTime：线程没任务时最多保持多长时间后会终止
         */
        executor.setCorePoolSize(5);

        // 开启线程
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());

    }

}
