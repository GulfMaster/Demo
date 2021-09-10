package com.wenbo.thread.communication;

/**
 * @author: liwenbo
 * @date: 2021-09-09 15:37:37
 * @desc: 线程通信----等待唤醒
 * wait释放锁
 * notify唤醒其它等待的线程
 *
 * 这里需要强调一下：sleep方法是不会释放当前的锁的，而wait方法会。
 * 它们还有这些区别：
 * wait可以指定时间，也可以不指定；而sleep必须指定时间。
 * wait释放cpu资源，同时释放锁；sleep释放cpu资源，但是不释放锁，所以易死锁。
 * wait必须放在同步块或同步方法中，而sleep可以在任意位置
 */
public class WaitAndNotify {
    private static Object lock = new Object();

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("ThreadA: " + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("ThreadB: " + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
//        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
