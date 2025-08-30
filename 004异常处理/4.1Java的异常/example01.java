import java.io.File;

class ProcessFile {
    public static int processFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                return 1;
            }
            if (!file.canRead()) {
                return 2;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}

public class example01 {
    public static void main(String[] args) {
        int code = ProcessFile.processFile("C:\\test.txt");
        if (code == 0) {
            System.out.println("File processed successfully.");
        } else {
            switch (code) {
                case 1:
                    System.out.println("file not found");
                    break;
                case 2:
                    System.out.println("no read permission");
                    break;
                default:
                    System.out.println("unknown error");
            }
        }
    }
}
