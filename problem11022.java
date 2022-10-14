import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem11022 {

    /**
     * @title A+B - 8  [11022]
     * @desc 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-14
     * @studyEndDate 2022-10-14
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        StringTokenizer st;
        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        bw.close();

    }
}
