package com.hensu.javapractise.javadrill.jdk.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: sh
 * @Description: NIO
 * @Date: 16:12 2019/9/3
 */
public class NIO {

    /**
     * 用java NIO api拷贝文件
     *
     * @param src
     * @param dst
     * @throws IOException
     */
    public static void copyFileUseNIO(String src, String dst) throws IOException {
        //声明源文件和目标文件
        FileInputStream fi = new FileInputStream(new File(src));
        FileOutputStream fo = new FileOutputStream(new File(dst));
        //获得传输通道channel
        FileChannel inChannel = fi.getChannel();
        FileChannel outChannel = fo.getChannel();
        //获得容器buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            //判断是否读完文件
            int eof = inChannel.read(buffer);
            if (eof == -1) {
                break;
            }
            /**
             * 控制buffer状态的三个变量
             * position：跟踪已经写了多少数据或读了多少数据，它指向的是下一个字节来自哪个位置
             * limit：代表还有多少数据可以取出或还有多少空间可以写入，它的值小于等于capacity。
             * capacity：代表缓冲区的最大容量，一般新建一个缓冲区的时候，limit的值和capacity的值默认是相等的。
             */
            //重设一下buffer的position=0，limit=position
            buffer.flip();
            //开始写
            outChannel.write(buffer);
            //写完要重置buffer，重设position=0,limit=capacity
            buffer.clear();
        }
        inChannel.close();
        outChannel.close();
        fi.close();
        fo.close();
    }


    public static void main(String[] args) {

    }
}
