class Person1{
    public String getName(){
        return "Person";
    }
}
class Student extends Person1{
    public int getScore(String type){
        return 99;
    }
    private int getGrade(int year){
        return 1;
    }
}
public class example01 {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}
