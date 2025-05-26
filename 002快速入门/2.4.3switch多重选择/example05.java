public class example05 {
    public static void main(String[] args){
        String fruit = "apple";
        int opt = switch(fruit) {
            case "apple" -> 1;
            case "banana" -> 2;
            default -> 0;
        };
        System.out.println("opt = "+opt);
    }
}
