import java.io.*;
import java.util.*;
public class Problem_F_An_Ancient_Sorting_Algorithm {
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if((arr[j]%2==0 && arr[i]%2==0)||(arr[j]%2!=0 && arr[i]%2!=0)){
                    if(arr[j]<arr[min_idx]){
                        min_idx=j;
                    }
                }
                else{
                  break;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
        for(int i=0;i<n;i++){
          if(i!=n-1){
            pw.print(arr[i]+" ");
          }
          else{
            pw.print(arr[i]);
          }
        }
        pw.flush();

    }
}
