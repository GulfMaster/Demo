package com.wenbo.loop;

/**
 * @author: liwenbo
 * @date: 2021-10-17 17:00:47
 * @desc: 嵌套循环 break
 */
public class MutiLoopContinue {
    public static void main(String[] args) {
//        breakOneLoop();
        breakMultiLoop();
    }

    private static void breakMultiLoop() {
        int i = 0;
        int j = 0;
        flag:
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == 5 && j == 6) {
                    System.out.println("i:" + i + " j:" + j);
                    System.out.println("----------------------");
                    continue flag;
                }
                System.out.println("i:" + i + " j:" + j);
            }
        }
        System.out.println("循环结束于 i:" + i + " j:" + j);
    }

    private static void breakOneLoop() {
        int i = 0;
        int j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == 5 && j == 6) {
                    System.out.println("i:" + i + " j:" + j);
                    System.out.println("----------------------");
                    break;
                }
                System.out.println("i:" + i + " j:" + j);
            }
        }
        System.out.println("i:" + i + " j:" + j);
    }
}
