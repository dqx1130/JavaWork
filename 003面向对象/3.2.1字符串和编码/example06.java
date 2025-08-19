import java.util.Arrays;
import java.util.Scanner;
class Score{
    private int[] scores;
    public Score(int[] scores){
        this.scores = scores;
    }
    public void printScore(){
        System.out.println(Arrays.toString(scores));
    }
}
public class example06 {
    public static void main(String[] args){
        int[] score = {88,77,66,55};
        Score s1 = new Score(score);
        System.out.println(s1);
        s1.printScore();
        score[2] = 99;
        s1.printScore();
    }
}
