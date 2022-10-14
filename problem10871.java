import java.io.*;
import java.util.StringTokenizer;

public class problem10871 {

    /**
     * @title X보다 작은 수 [10871]
     * @desc 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-14
     * @studyEndDate 2022-10-14
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums=  br.readLine().split(" ");
        String[] numArr = br.readLine().split(" ");


        String answer="";
        for(int i=0;i<Integer.parseInt(nums[0]);i++){
            if(Integer.parseInt(nums[1])>Integer.parseInt(numArr[i])){
                answer= answer+numArr[i]+" ";
            }
        }
        bw.write(answer);
        bw.close();
    }
}
