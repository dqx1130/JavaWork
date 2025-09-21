class Person1{
    public String name;
}
class Student extends Person1{
    public int score;
    private int grade;
}

public class example01 {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}
