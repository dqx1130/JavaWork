public class example03 {
    public static void main(String[] args){
        String s = """
                Select * from
                users
                where id > 100
                order by name DESC
                """;
        System.out.println(s);
    }
}
