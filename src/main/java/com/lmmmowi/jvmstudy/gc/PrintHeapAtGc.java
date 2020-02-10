/**
 * JVM参数：-XX:+PrintHeapAtGC
 *
 * 该参数会在每次GC前、后分别打印堆的信息，格式如同-XX:+PrintGcDetails最后输出的内容一样。{@link com.lmmmowi.jvmstudy.gc.PrintGcDetails}
 * 考虑到兼容性，从JDK9开始已经删除此参数。
 */
package com.lmmmowi.jvmstudy.gc;

/**
 * @Author: mowi
 * @Date: 2020/2/10
 * @Description:
 */
public class PrintHeapAtGc {

    private static final int ONE_M = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            byte[] data = new byte[ONE_M];
            Thread.sleep(100);
        }
    }

}
