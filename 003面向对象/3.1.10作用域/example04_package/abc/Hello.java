package abc;

public class Hello {
    void hi(String name){
        String s = name.toLowerCase();
        int len = s.length();
        if (len < 10){
            int p = 10 - len;
            for (int i = 0;i < 10;i++){
                System.out.println();
            }
        }
    };
}
