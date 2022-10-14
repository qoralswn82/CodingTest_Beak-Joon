import java.io.*;

public class problem2439 {

    /**
     * @title 별 찍기 - 2 [2439]
     * @desc 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     *
     * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
     *
     *
     * @studyStartDate 2022-10-14
     * @studyEndDate 2022-10-14
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=num-1;i>=0;i--){
            for(int j=0;j<i;j++){
                bw.write(" ");
            }
            for(int j=0;j<num-i;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
