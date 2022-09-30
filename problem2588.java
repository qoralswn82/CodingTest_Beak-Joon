
import java.util.Scanner;

public class problem2588 {
    /**
     * @title 곱셈 [2588]
     * @desc (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     *
     *              472 ```````(1)
     *              x385 ```````(2)
     *              ---------------
     *              2360```````(3)
     *              3776 ```````(4)
     *              1416  ```````(5)
     *              ---------------
     *              181720```````(6)
     *
     * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
     * @studyStartDate 2022-09-30
     * @studyEndDate 2022-09-30
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        String num2 = scan.next();
        int sum=0;
        int digit=0;
        int answer=0;

        for(int i=num2.length();i>0;i--){

                digit= num2.length()-i;
                answer=num1*(num2.charAt(i-1)-'0');// change char to int => char - '0' (use ASCII Code)

                System.out.println(answer);
                if(digit!=0)answer*=Math.pow(10,digit);

                sum+=answer;
        }
        System.out.println(sum);
    }
}
