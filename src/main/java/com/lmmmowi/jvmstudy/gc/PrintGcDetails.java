/**
 * JVM参数：-XX:+PrintGCDetails
 *
 * [GC (Allocation Failure) [PSYoungGen: 33036K->496K(38400K)] 33036K->504K(125952K), 0.0031674 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * Times-user：用户态CPU耗时
 * Times-sys：系统CPU耗时
 * Times-real：GC实际经历的时间
 *
 * 虚拟机退出前会打印堆栈详细信息，描述各个区间的使用情况。每个部分最后会有3个16进制数字，表示当前区间的下界、当前上界、上界。
 */
package com.lmmmowi.jvmstudy.gc;

/**
 * @Author: mowi
 * @Date: 2020/2/10
 * @Description:
 */
public class PrintGcDetails {

    private static final int ONE_M = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            byte[] data = new byte[ONE_M];
            Thread.sleep(100);
        }
    }

}
