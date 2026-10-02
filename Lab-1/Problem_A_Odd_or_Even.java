import java.io.*;
public class Problem_A_Odd_or_Even {
    public static void main(String[]args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());   
        for(int i=0;i<n;i++){
            int p=Integer.parseInt(br.readLine());  
            if(p%2==0){ 
                pw.println(p+" is an Even number.");
            }
            else{
                pw.println(p+" is an Odd number.");
            }
        }
        pw.flush();
 
    }
}
