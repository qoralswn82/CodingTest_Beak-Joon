import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem10951 {

    /**
     * @title A+B - 4  [10951]
     * @desc 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-14
     * @studyEndDate 2022-10-14
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read=br.readLine();
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        while(read!=null){
            st=new StringTokenizer(read);
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
            read=br.readLine();
        }
        System.out.println(sb);
    }
}
