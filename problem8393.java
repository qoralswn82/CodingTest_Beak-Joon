import java.util.Scanner;

public class problem8393 {

    /**
     * @title 합  [8393]
     * @desc n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-11
     * @studyEndDate 2022-10-11
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
