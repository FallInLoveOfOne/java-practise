package com.hensu.javapractise.javadrill.jdk.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: sh
 * @Description:
 * @Date: 11:55 2019/9/3
 */
public class IO {

    public static void fileOpt() {
        //检查文件是否存在
        File file = new File("d:/test.txt");
        boolean fileExists = file.exists();
        System.out.println(fileExists);
        //创建文件目录,若父目录不存在则返回false
        File file2 = new File("d:/fatherDir/subDir");
        boolean dirCreated = file2.mkdir();
        System.out.println(dirCreated);
        //创建文件目录,若父目录不存则连同父目录一起创建
        File file3 = new File("d:/fatherDir/subDir2");
        boolean dirCreated2 = file3.mkdirs();
        System.out.println(dirCreated2);
        File file4 = new File("d:/test.txt");
        //判断长度
        long length = file4.length();
        //重命名文件
        boolean isRenamed = file4.renameTo(new File("d:/test2.txt"));
        //删除文件
        boolean isDeleted = file4.delete();
        File file5 = new File("d:/fatherDir/subDir");
        //是否是目录
        boolean isDirectory = file5.isDirectory();
        //列出文件名
        String[] fileNames = file5.list();
        //列出目录
        File[] files = file4.listFiles();
    }

    /**
     * 随机读
     *
     * @throws IOException
     */
    public static void randomAccessFileRead() throws IOException {
        // 创建一个RandomAccessFile对象
        RandomAccessFile file = new RandomAccessFile("d:/test.txt", "rw");
        // 通过seek方法来移动读写位置的指针
        file.seek(10);
        // 获取当前指针
        long pointerBegin = file.getFilePointer();
        // 从当前指针开始读
        byte[] contents = new byte[1024];
        file.read(contents);
        long pointerEnd = file.getFilePointer();
        System.out.println("pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n" + new String(contents));
        file.close();
    }

    /**
     * 随机写
     *
     * @throws IOException
     */
    public static void randomAccessFileWrite() throws IOException {
        // 创建一个RandomAccessFile对象
        RandomAccessFile file = new RandomAccessFile("d:/test.txt", "rw");
        // 通过seek方法来移动读写位置的指针
        file.seek(10);
        // 获取当前指针
        long pointerBegin = file.getFilePointer();
        // 从当前指针位置开始写
        file.write("HELLO WORD".getBytes());
        long pointerEnd = file.getFilePointer();
        System.out.println("pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n");
        file.close();
    }

    /**
     * 管道既可以作为输入、也可以作为输出
     * （而在java中，管道只能为同一个JVM进程中的不同线程进行通信。和管道相关的IO类为：PipedInputStream和PipedOutputStream）
     *
     * @throws Exception
     */
    public static void piped() throws Exception {
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream(output);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    output.write("Hello world, pipe!".getBytes());
                } catch (IOException e) {
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = input.read();
                    while (data != -1) {
                        System.out.print((char) data);
                        data = input.read();
                    }
                } catch (IOException e) {
                } finally {
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

    /**
     * 缓冲字节流读取
     *
     * @throws IOException
     */
    public static void readByBufferedInputStream() throws IOException {
        File file = new File("d:/test.txt");
        byte[] byteArray = new byte[(int) file.length()];
        //可以在构造参数中传入buffer大小，使用缓冲流包裹普通流
        InputStream is = new BufferedInputStream(new FileInputStream(file), 2 * 1024);
        int size = is.read(byteArray);
        System.out.println("大小:" + size + ";内容:" + new String(byteArray));
        is.close();
    }

    /**
     * 缓冲字符流读取
     * @throws IOException
     */
    public static void readByBufferedReader() throws IOException {
        File file = new File("d:/test.txt");
        // 在字符流基础上用buffer流包装，也可以指定buffer的大小
        Reader reader = new BufferedReader(new FileReader(file), 2 * 1024);
        char[] byteArray = new char[(int) file.length()];
        int size = reader.read(byteArray);
        System.out.println("大小:" + size + ";内容:" + new String(byteArray));
        reader.close();
    }

    /**
     * 字节流转换为字符流
     *
     * @throws IOException
     */
    public static void convertByteToChar() throws IOException {
        File file = new File("C:\\Users\\dhht\\Desktop\\个人\\IO.txt");
        //获得一个字节流
        InputStream is = new FileInputStream(file);
        //把字节流转换为字符流，其实就是把字符流和字节流组合的结果。
        Reader reader = new InputStreamReader(is);
        char[] byteArray = new char[(int) file.length()];
        int size = reader.read(byteArray);
        System.out.println("大小:" + size + ";内容:" + new String(byteArray));
        is.close();
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:\\Users\\dhht\\Desktop\\个人\\IO.txt");
        writer.write("hello\n");
        writer.write("word\n");
        writer.flush();
        Reader reader = new FileReader("C:\\Users\\dhht\\Desktop\\个人\\IO.txt");
        char[] vals = new char[1024];
        while (reader.read(vals) != -1) {

        }
        Arrays.asList(vals);
        System.out.println(vals.toString());
        convertByteToChar();
    }
}
