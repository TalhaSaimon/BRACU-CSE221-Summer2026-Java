    import java.io.*;
    import java.util.*;
    public class Problem_F_Count_the_Numbers{
        public static void main(String[]args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw=new PrintWriter(System.out);
          StringTokenizer st =new StringTokenizer(br.readLine());
          int n1=Integer.parseInt(st.nextToken());
          int n2=Integer.parseInt(st.nextToken());
          int arr[]=new int[n1];
          st =new StringTokenizer(br.readLine());
          for(int i=0;i<n1;i++){
               arr[i]=Integer.parseInt(st.nextToken());
          }
          for(int i=0;i<n2;i++){
                st =new StringTokenizer(br.readLine());
                int num1=Integer.parseInt(st.nextToken());
                int num2=Integer.parseInt(st.nextToken());
                int l= lbound(arr,num1);
                int r= rbound(arr,num2);

                pw.println(r-l);
          }
          pw.flush();
        }
        public static int lbound(int []arr,int n){
             int l = 0;
             int r = arr.length-1;
             int ans =arr.length;
             while(l<=r){
              int mid=(l+r)/2;
              if(arr[mid]>=n){
                  r=mid-1;
                  ans=mid;
              }
              else{
                l=mid+1;
              }
             }
             return ans;

        }
        public static int rbound(int []arr,int n){
             int l = 0;
             int r = arr.length-1;
             int ans=arr.length;
             while(l<=r){
              int mid=(l+r)/2;
              if(arr[mid]>n){
                  r=mid-1;
                  ans=mid;
              }
              else{
                l=mid+1;
              }
             }
             return ans;

        }
    
}

