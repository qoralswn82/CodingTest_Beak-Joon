import java.io.*;

public class problem10952 {

    /**
     * @title A+B - 5 [10952]
     * @desc 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     *
     * @studyStartDate 2022-10-14
     * @studyEndDate 2022-10-14
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        /*
        * String is immutable-> String 객체의 경우 다른 string 과 + 연산자를 통한 결합의 경우 새 객체 생성
        * ex) + 연산자로 계속적으로 사용한다면 매번 새로운 객체 생성 (성능 저하 발생)
        *
        * => 해결방한 stringBuilder (새로 생성이 아닌 rewrite)
        *
        * stringBuilder 사용 시 주의 점 thread-safety
        * thread-safety : 멀티 스레드 프로그래밍에서 일반적으로 어떤 함수나 변수, 혹은 객체가 여러 스레드로부터 동시에 접근이 이루어져도 프로그램의 실행에 문제가 없음을 뜻
        *
        * */

        String[] nums=br.readLine().split(" ");
        while(Integer.parseInt(nums[0])!=0&&Integer.parseInt(nums[1])!=0){
           // bw.write(Integer.parseInt(nums[0])+Integer.parseInt(nums[1])+"\n");
            sb.append(Integer.parseInt(nums[0])+Integer.parseInt(nums[1])+"\n");
            nums=br.readLine().split(" ");
        }
        //bw.close();
        System.out.println(sb);
    }
}
