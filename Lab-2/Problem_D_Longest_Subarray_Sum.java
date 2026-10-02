    import java.io.*;
    import java.util.*;
    public class Problem_D_Longest_Subarray_Sum {
        public static void main(String[]args)throws Exception{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw =new PrintWriter (System.out);
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            }
            int max_idx=0,sum=0,l=0;

            for(int r=0;r<n;r++){
                 sum+=arr[r];
                 while(l<=r && k<sum){  // If the sum is more than the varue of k, We increase j.
                    sum -=arr[l];
                    l++;
                 }
                 int s=r-l+1;
                 if(s>max_idx){
                    max_idx=s;
                 }
                }
            pw.println(max_idx);
            pw.flush();
        }
    }

