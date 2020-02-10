/**
 * JVM参数：-XX:+PrintGC
 */
package com.lmmmowi.jvmstudy.gc;

/**
 * @Author: mowi
 * @Date: 2020/2/10
 * @Description:
 */
public class PrintGc {

    private static final int ONE_M = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            byte[] data = new byte[ONE_M];
            Thread.sleep(100);
        }
    }

}
