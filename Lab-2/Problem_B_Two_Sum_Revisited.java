import java.io.*;
import java.util.*;
public class Problem_B_Two_Sum_Revisited{
    public static void main(String[] args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n1=Integer.parseInt(st.nextToken());
        int n2=Integer.parseInt(st.nextToken());
        int target =Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        StringTokenizer s= new StringTokenizer(br.readLine());
        int arr1[]= new int[n1];
        int arr2[]= new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=Integer.parseInt(st.nextToken());  
        }
        for(int i=0;i<n2;i++){
        arr2[i]=Integer.parseInt(s.nextToken());
        }
        int arr[]=new int[2];
        int min =Integer.MAX_VALUE;
        int i=0;
        int j=n2-1;
        while(i<n1 && j>=0){
                int asum = arr1[i] + arr2[j] ; 
                int sum=Math.abs(asum-target);
                if(min>sum){
                    min=sum;
                    arr[0]=i+1;
                    arr[1]=j+1;
                } 
                if (asum<target) {
                    i++;
                }  
                else{
                   j--;
                }     
        }
       pw.println(arr[0]+" "+arr[1]);
       pw.flush(); 
    }
}