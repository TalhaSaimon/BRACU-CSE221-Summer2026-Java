import java.io.*;
import java.util.*;
public class Problem_G_Sorting_Again{
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int total=Integer.parseInt(br.readLine());
        
        for(int i=0;i<total;i++){
        int c=0;
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());

        //Creating an array
        int arr[][]=new int[n][2];
        for(int j=0;j<n;j++){
            arr[j][0]=Integer.parseInt(st.nextToken());
        }
        StringTokenizer s =new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++){
            arr[j][1]=Integer.parseInt(s.nextToken());
        }

        //Modified selection sort
        for(int j=0;j<n;j++){
          int idx=j;
          boolean val=false;
          for(int k=j+1;k<n;k++){
            if(arr[idx][1]<arr[k][1]){
              idx=k;
              val=true;
            }
            else if(arr[idx][1]==arr[k][1] && arr[idx][0]>arr[k][0]){
              val=true;
              idx=k;
            }
          }
          if(val){
          int temp1=arr[idx][0];
          arr[idx][0]=arr[j][0];
          arr[j][0]=temp1;
          
          int temp2=arr[idx][1];
          arr[idx][1]=arr[j][1];
          arr[j][1]=temp2;
          c++;
          }
        }
        pw.println("Minimum swaps: "+c);
        for(int j=0;j<n;j++){
          pw.println("ID: "+arr[j][0]+" Mark: "+arr[j][1]);
        }
        }
        pw.flush();
    }
}
          
              
              
              
              
              
              
              
              
              
              
              
              
              
            