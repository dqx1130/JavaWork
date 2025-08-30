import java.io.*;
// 辅助类，包含文件处理方法
class ProcessFileHelper {
    /**
     * 读取文件内容，如遇到异常抛出相应的异常类型
     */
    public static String processFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException(path + " not found");
        }
        if (!file.canRead()) {
            throw new SecurityException("No read permission for " + path);
        }

        // 读取文件内容
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
public class example02 {
    public static void main(String[] args) {
        try {
            String s = ProcessFileHelper.processFile("C:\\test.txt");
            // ok: 成功读取文件
            System.out.println("File content:\n" + s);
        } catch (FileNotFoundException e) {
            // file not found:
            System.out.println("File not found: " + e.getMessage());
        } catch (SecurityException e) {
            // no read permission:
            System.out.println("No read permission: " + e.getMessage());
        } catch (IOException e) {
            // io error:
            System.out.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            // other error:
            System.out.println("Other error: " + e.getMessage());
        }
    }
}

