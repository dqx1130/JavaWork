import java.util.HashMap;
public class example03 {
    public static void main(String[] args){
        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>(){};      //匿名类
        HashMap<String,String> map3 = new HashMap<>(){
            {
                put("A","1");
                put("B","2");
            }
        };
        System.out.println(map3.get("A"));
    }
}
