class City{
    public String name;
    public double latitude;
    public double longitude;
}
public class practise01 {
    public static void main(String[] args){
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location:" + bj.latitude + "," + bj.longitude);
    }
}

/*
在OOP中，class和instance是“模版”和“实例”的关系；
定义class就是定义了一种数据类型，对应的instance是这种数据类型的实例；
class定义的field，在每个instance都会拥有各自的field，且互不干扰；
通过new操作符创建新的instance，然后用变量指向它，即可通过变量来引用这个instance；
访问实例字段的方法是变量名.字段名；
指向instance的变量都是引用变量。
 */
