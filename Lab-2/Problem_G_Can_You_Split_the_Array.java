    import java.io.*;
    import java.util.*;
    public class Problem_G_Can_You_Split_the_Array{
        public static void main(String[]args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw=new PrintWriter(System.out);
          StringTokenizer st =new StringTokenizer(br.readLine());
          int n=Integer.parseInt(st.nextToken());
          int k=Integer.parseInt(st.nextToken());
          st =new StringTokenizer(br.readLine());
          int arr[] =new int[n];
          long high=0;
          long low=0;
          for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(i==0){
                low=arr[i];
            }
            else if(arr[i]>low){
                low=arr[i];
            }
            high+=arr[i];
          }
          long mid=0;
          while(low<=high){
            mid =(high+low)/2;
            long sum=0;
            int c=1;
            for(int i=0;i<n;i++){
                if(sum+arr[i]>mid){
                    c++;
                    sum=0;
                }
                sum+=arr[i];
            }
            if(c<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

          }
          pw.println(low);
          pw.flush();
        }
    }
