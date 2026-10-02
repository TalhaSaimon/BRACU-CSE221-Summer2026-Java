import java.io.*;
import java.util.*;
public class Problem_D_Is_Sorted{
  public static void main(String[] args)  throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int total =Integer.parseInt(br.readLine());
    for(int i=0;i<total;i++){
      boolean val =true;
      int n =Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      //Creating an array
      int [] arr=new int[n];
      for(int j=0;j<n;j++){
        arr[j] =Integer.parseInt(st.nextToken());
      }
      //Check acending order
      for(int j=0;j<=n-2;j++){
          if(arr[j]>arr[j+1]){
            val=false;
            break;
          } 
      }

      if(val){
          pw.println("YES");
        }
        else{
          pw.println("NO");
        }
    }
    pw.flush();
        
      
    }
  }
