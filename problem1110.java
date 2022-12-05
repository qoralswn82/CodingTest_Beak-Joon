import java.io.*;

public class problem1110 {

    /**
     * @title 더하기 사이클 [1110]
     * @desc 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
     *
     * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
     *
     * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
     *
     * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-14.
     * @studyEndDate 2022-10-14
     */

    /*
    * 반복되는 과정
    * 1. 두 자리 수를 분리
    * 2. 각 자리 수의 합
    * 2-1. 각자리 수의 합 > 10
    * 2-1-1. 각 자리 분리
    * 2-1-2. 뒷자리 킵
    * 2-2. 각자리 수의 합 < 10
    * 3. 두자리 수의 마지막 + 각자리수 str
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] num = br.readLine().toCharArray();
        int anNum1=0;
        int anNum2=0;

        int count = 0;
        int num1=0;
        int num2=0;
        int numSum=0;

        if(num.length==1){
            num1=0;
            anNum1=0;
            num2=num[0]-'0';
            anNum2=num2;
        }else{
            num1 = num[0] - '0';
            anNum1=num1;
            num2 = num[1] - '0';
            anNum2=num2;
        }
        System.out.println("시작");
        System.out.println("num[0] : "+num[0]);
        if(num.length>1)System.out.println("num[1] : "+num[1]);
        do{
            count++;
            if (num1 == 0) {

                numSum = num2;
            } else {

                numSum = num1 + num2;
            }
            System.out.println("1번");
            System.out.println("num1 : "+num1);
            System.out.println("num2 : "+num2);
            System.out.println("numSum : "+numSum);
            num1 = num2;
            if(numSum/10>0){
                num2=(numSum%10);
            }else num2 = numSum;
            //numSum=num1+num2;
            System.out.println("2번");
            System.out.println("num[0] : "+num[0]);
            if(num.length>1) System.out.println("num[1] : "+num[1]);
            System.out.println("num1 : "+num1);
            System.out.println("num2 : "+num2);
            System.out.println("numSum : "+numSum);
            System.out.println("정답 : "+num1+num2);

        }while(!(num1==anNum1&&num2==anNum2));
        System.out.println(count);
        bw.write(count);
    }
}
