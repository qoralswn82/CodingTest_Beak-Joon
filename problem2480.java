import java.util.Scanner;

public class problem2480 {

    /**
     * @title 주사위 세개 [2480]
     * @desc 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
     *
     * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
     * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
     * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
     *
     * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
     *
     *
     * @studyStartDate 2022-10-11
     * @studyEndDate 2022-10-11
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] nums=new int[3];
        nums[0]=scan.nextInt();
        nums[1]=scan.nextInt();
        nums[2]=scan.nextInt();
        int count=0;
        int sum=0;
        int num=0;
        if(nums[0]==nums[1]){
            num=nums[0];
            count++;
        }
        if(nums[0]==nums[2]){
            num=nums[2];
            count++;
        }
        if(nums[1]==nums[2]){
            num=nums[1];
            count++;
        }


        switch (count){
            case 0: //모두 다를 때
                int max=nums[0];
                if(max<nums[1])max=nums[1];
                if(max<nums[2])max=nums[2];
                sum=max*100;
                break;
            case 1: //두개만 같을 때
                sum=1000+num*100;
                break;
            default: // ㅁ두 같을때
                sum=10000+num*1000;
                break;

        }

        System.out.println(sum);
    }
}
