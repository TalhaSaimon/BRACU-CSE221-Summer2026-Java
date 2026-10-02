import java.io.*;
import java.util.*;
public class Problem_C_Graph_Metamorphosis{
    public static void main(String [] args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw= new PrintWriter(System.out);
          StringTokenizer st =null;

          int n=Integer.parseInt(br.readLine());
          int arr[][]=new int[n][n];
         for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int len=Integer.parseInt(st.nextToken());
            for(int j=0;j<len;j++){
                int val=Integer.parseInt(st.nextToken());
                arr[i][val]=1;
            }
         }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 pw.print(arr[i][j]+" ");
            }
            pw.println();
         }
         pw.flush();
    }
}
