import java.util.Scanner;

public class example01 {
    public static class Student{
        private String name;
        private String gender;
        private int score;
        private boolean award;

        public Student(String name, String gender, int score, boolean award) {
            this.name = name;
            this.gender = gender;
            this.score = score;
            this.award = award;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public boolean isAward() {
            return award;
        }

        public void setAward(boolean award) {
            this.award = award;
        }

        @Override
        public String toString() {
//            Student [name=Rose, gender=female, score=96, award=true]
            return "Student [name="+name+", gender="+gender+", score="+score+", award="+award+"]";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String gender = sc.next();
        int score = sc.nextInt();
        boolean award = sc.nextBoolean();
        Student stu = new Student(name,gender,score,award);
        System.out.println(stu);
    }
}
