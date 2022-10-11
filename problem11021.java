import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem11021 {

    /**
     * @title A+B - 7 [11021]
     * @desc 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-11
     * @studyEndDate 2022-10-11
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine());
            bw.write("Case #"+i+1+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();
    }
}
