/**
 * JVM参数：-XX:+PrintGCApplicationConcurrentTime -XX:+PrintGCApplicationStoppedTime
 *
 * 使用-XX:+PrintGCApplicationConcurrentTime可以打印应用程序的执行时间。
 * 使用-XX:+PrintGCApplicationStoppedTime可以打印应用程序由于GC而产生的停顿时间。
 */
package com.lmmmowi.jvmstudy.gc;

/**
 * @Author: mowi
 * @Date: 2020/2/10
 * @Description:
 */
public class PrintGcApplicationTime {

    private static final int ONE_M = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            byte[] data = new byte[ONE_M];
            Thread.sleep(100);
        }
    }

}
