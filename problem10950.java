import java.util.Scanner;

public class problem10950 {

    /**
     * @title A+B - 3 [10950]
     * @desc 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-11
     * @studyEndDate 2022-10-11
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        String answer="";
        for(int i=0;i<num;i++){
            answer+=scan.nextInt()+scan.nextInt()+"\n";
        }
        System.out.println(answer);
    }
}
