import java.io.*;
import java.util.*;
public class Problem_B_Calculator{
    public static void main(String[]args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine()); 
        for(int i=0;i<n;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            long n1 = 0, n2 = 0;
            String s="";
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    st.nextToken(); 
                } 
                else if (j == 1) {
                    n1 = Long.parseLong(st.nextToken());
                } 
                else if (j == 2) {
                    s = st.nextToken();
                } 
                else if (j == 3) {
                    n2 = Long.parseLong(st.nextToken());
                }
            }
            if(s.equals("+")){
                pw.println(n1+n2);
            }
            else if(s.equals("-")){
                pw.println(n1-n2);
            }
            else if (s.equals("/")) {
                double d = (double) n1 / n2;
                pw.println(String.format("%.10f", d));
            }
            else if(s.equals("*")){
                pw.println(n1*n2);
            }
            else if(s.equals("&")){
                pw.println(n1 & n2);
            }
            else if(s.equals("%")){
                pw.println(n1 % n2);
            }
            else if(s.equals("^")){
                pw.println(n1 ^ n2);
            }
            else if(s.equals("|")){
                pw.println(n1 | n2);
            }
            else if(s.equals(">>")){
                pw.println(n1 >> n2);
            }
            else if(s.equals("<<")){
                pw.println(n1 << n2);
            }
        }
        pw.flush();
    }
}