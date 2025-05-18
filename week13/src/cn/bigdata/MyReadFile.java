package cn.bigdata;

    import java.io.*;

    // 定义一个类 MyReadFile
    public class MyReadFile {
        public static void main(String[] args) {
            try {
                // 定义输入文件路径
                File inFile = new File("/Users/cyberloafing/javatest/1.txt");
                // 定义输出文件路径
                File outFile = new File("/Users/cyberloafing/javatest/2.txt");

                // 创建文件读取器
                FileReader fr = new FileReader(inFile);
                // 创建缓冲读取器
                BufferedReader br = new BufferedReader(fr);

                // 创建文件写入器
                FileWriter fw = new FileWriter(outFile);
                // 创建打印写入器
                PrintWriter pw = new PrintWriter(fw);

                // 逐行读取输入文件内容并写入输出文件
                while (br.ready()) {
                    pw.println(br.readLine());
                }

                // 关闭打印写入器
                pw.close();
            } catch (Exception e) {
                // 捕获并打印异常信息
                e.printStackTrace();
            }
        }
    }