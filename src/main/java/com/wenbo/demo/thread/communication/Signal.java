package com.wenbo.demo.thread.communication;

/**
 * @author: liwenbo
 * @date: 2021-09-09 15:55:59
 * @desc: 线程通信----volatile
 */
public class Signal {
    private static volatile int signal = 0;
    private final static int LIMIT = 20;

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            while (signal < LIMIT) {
                if (signal % 2 == 0) {
                    System.out.println("threadA: " + signal);
                    synchronized (this) {
                        signal++;
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            while (signal < LIMIT) {
                if (signal % 2 == 1) {
                    System.out.println("threadB: " + signal);
                    synchronized (this) {
                        signal = signal + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
//        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
