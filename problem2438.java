import java.io.*;

public class problem2438 {

    /**
     * @title 별 찍기 - 1 [2438]
     * @desc 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     *
     *
     * @studyStartDate 2022-10-14
     * @studyEndDate 2022-10-14
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=0;i< num;i++){
            for(int j=0;j<=i;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
