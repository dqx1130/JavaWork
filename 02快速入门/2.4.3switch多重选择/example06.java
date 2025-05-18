public class example06 {
    public static void main(String[] args){
        // 定义一个字符串变量fruit，并赋值为"orange"
        String fruit = "orange";
        
        // 使用switch表达式根据fruit的值确定opt的取值
        int opt = switch (fruit){
            // 如果fruit是"apple"，则opt为1
            case "apple" -> 1;
            
            // 如果fruit是"pear"或"mango"，则opt为2
            case "pear","mango" -> 2;
            
            // 默认情况下，执行以下代码块
            // 需要复杂的语句，我们也可以写很多语句，放到{...}里，然后，用yield返回一个值作为switch语句的返回值
            default -> {
                // 计算fruit的哈希码并赋值给code变量
                int code = fruit.hashCode();
                
                // 将code的值返回并赋值给opt
                yield code;
            }
        };
    };
}
