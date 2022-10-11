import java.util.Scanner;

public class problem2739 {

    /**
     * @title 구구단 [2739]
     * @desc N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
     *
     *
     * @studyStartDate 2022-10-11
     * @studyEndDate 2022-10-11
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
