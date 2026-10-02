import java.io.*;
import java.util.*;
public class Problem_E_Reverse_Sorting{
    public static void main(String[] args)  throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw = new PrintWriter(System.out);
      int n=Integer.parseInt(br.readLine());
      int [] arr=new int[n];
      int [] arr1=new int[n*n];
      StringTokenizer st = new StringTokenizer(br.readLine());
      int c=0;
      boolean val =true;
      for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(st.nextToken());
      }
      if(n<3){
        if(n==2 && arr[0]>arr[1]){
         val=false;
        }
      }
      else{
        int idx=0;
        for(int k=0;k<n;k++){
         int j=2;
        for(int i=0;j<n;i++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                c++;
                arr1[idx]=i+1;
                idx++;
                arr1[idx++]=j+1;
            }
            j++;
            }
        }

            for(int i=0; i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    val=false;
                    break;
                }
            }
        }
        if(val){
            pw.println("YES\n"+c);
            for(int i=0;i<c*2;i+=2){
                pw.println(arr1[i]+" "+arr1[i+1]);
            }
        }
        else{
            pw.println("NO");
        }
        pw.flush();
        }
      }