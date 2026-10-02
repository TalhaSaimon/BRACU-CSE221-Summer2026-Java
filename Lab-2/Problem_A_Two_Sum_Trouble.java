import java.io.*;
import java.util.*;
public class Problem_A_Two_Sum_Trouble{
    public static void main(String[] args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int target =Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int j=n-1;
        int i=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                pw.println(i+1+" "+(j+1));
                pw.flush();
                return;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        
        pw.println(-1);
        
        pw.flush();

    }
}