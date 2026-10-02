import java.io.*;
public class Problem_C_Fast_Sum{
    public static void main(String[] args)  throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Long n =Long.parseLong(br.readLine());
        for(long i=0;i<n;i++){
            Long n1 =Long.parseLong(br.readLine());
            Long sum =n1*(n1+1)/2;
            System.out.println(sum);
        }
    }
}
