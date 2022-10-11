import java.util.Scanner;

public class problem1330 {

    /**
     * @title 두 수 비교하기 [1330]
     * @desc 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-11
     * @studyEndDate 2022-10-11
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        if(num1-num2>0)System.out.println(">");
        else if(num1-num2<0)System.out.println("<");
        else System.out.println("==");
    }
}
