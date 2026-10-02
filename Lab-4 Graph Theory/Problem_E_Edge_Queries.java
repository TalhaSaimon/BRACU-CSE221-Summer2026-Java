import java.io.*;
import java.util.*;
public class Problem_E_Edge_Queries{
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
            // st =new StringTokenizer(br.readLine());
            // for(int j=0;j<total;j++){
            //     arr[Integer.parseInt(st.nextToken())-1]-=1;
            // }
            // st =new StringTokenizer(br.readLine());
            // for(int j=0;j<total;j++){
            //     arr[Integer.parseInt(st.nextToken())-1]+=1;
            // }

             StringTokenizer st1 =new StringTokenizer(br.readLine());
             StringTokenizer st2 =new StringTokenizer(br.readLine());
             for(int j=0;j<total;j++){
               arr[Integer.parseInt(st1.nextToken())-1]-=1;
               arr[Integer.parseInt(st2.nextToken())-1]+=1;
             }

          for(int i=0;i<n;i++){
            pw.print(arr[i]+" ");
          }
          pw.flush();

    }
    
}
