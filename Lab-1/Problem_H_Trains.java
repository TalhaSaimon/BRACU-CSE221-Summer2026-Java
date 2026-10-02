import java.io.*;
import java.util.*;
public class Problem_H_Trains{
    public static void main(String[]args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());    
        String arr [][]=new String[n][4];
        for(int i=0;i<n;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int j=0;j<7;j++){
            if(j==0){
                arr[i][0]=st.nextToken(); // name
            }
            else if(j==4){
                arr[i][1]=st.nextToken(); // destination
            }
            else if(j==6){
                arr[i][2]=st.nextToken(); // time
            }
            else{
                st.nextToken();
            }
        }
        arr[i][3] = String.valueOf(i); // original index
    }
           
        for(int i=0;i<n;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                
               int k=arr[idx][0].compareTo(arr[j][0]);
            if(k>0){
                idx=j;
            }
            else if(k==0){
                 StringTokenizer s1 = new StringTokenizer(arr[idx][2], ":");
                 StringTokenizer s2 = new StringTokenizer(arr[j][2], ":");
                 int t1 = Integer.parseInt(s1.nextToken()+s1.nextToken());
                 int t2 = Integer.parseInt(s2.nextToken()+s2.nextToken());   
                if(t2>t1){
                    idx=j;
                }
                else if(t1==t2){
                    int idx1 = Integer.parseInt(arr[idx][3]);
                    int idx2 = Integer.parseInt(arr[j][3]);
                        if (idx2 < idx1) {
                            idx = j;
                        }
                }            
            }
            }
             String[] temp = arr[idx];
             arr[idx] = arr[i];
             arr[i] = temp;


        //   String temp1=arr[idx][0];
        //   arr[idx][0]=arr[i][0];
        //   arr[i][0]=temp1;
        //   String temp2=arr[idx][1];
        //   arr[idx][1]=arr[i][1];
        //   arr[i][1]=temp2;
        //   String temp3=arr[idx][2];
        //   arr[idx][2]=arr[i][2];
        //   arr[i][2]=temp3;
        //   String temp4 = arr[idx][3];
        //   arr[idx][3] = arr[i][3];
        //   arr[i][3] = temp4;
        

        }
        for(int i=0;i<n;i++){
            pw.println(arr[i][0]+" will departure for "+arr[i][1]+" at "+arr[i][2]);
        }
        pw.flush();
    }
}