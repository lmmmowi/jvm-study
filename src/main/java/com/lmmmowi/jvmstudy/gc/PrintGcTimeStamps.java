/**
 * JVM参数：-XX:+PrintGC -XX:+PrintGCTimeStamps
 *
 * 添加该参数后，可以打印每次GC发生的时间点。
 */
package com.lmmmowi.jvmstudy.gc;

/**
 * @Author: mowi
 * @Date: 2020/2/10
 * @Description:
 */
public class PrintGcTimeStamps {

    private static final int ONE_M = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            byte[] data = new byte[ONE_M];
            Thread.sleep(100);
        }
    }

}
