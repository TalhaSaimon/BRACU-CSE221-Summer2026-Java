import java.io.*;
import java.util.*;
public class Problem_D_The_Seven_Bridges_of_Königsberg{
    public static void main(String [] args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw= new PrintWriter(System.out);
          StringTokenizer st =new StringTokenizer(br.readLine());
          int n=Integer.parseInt(st.nextToken());
          int arr[] =new int[n];
          int total=Integer.parseInt(st.nextToken());
          for(int i=0;i<n;i++){
             arr[i]=0;
          }
          for(int i=0;i<2;i++){
            st =new StringTokenizer(br.readLine());
            for(int j=0;j<total;j++){
              int idx=Integer.parseInt(st.nextToken())-1;
                arr[idx]++;
            }
          }
          int oddcount=0;
          for(int i=0;i<n;i++){
             if(arr[i] %2 !=0){
                oddcount++;
             }
          }
          if(oddcount==0 || oddcount==2){
            pw.println("YES");
          }
          else{
            pw.println("NO");
          }
          pw.flush();

    }
    
}
