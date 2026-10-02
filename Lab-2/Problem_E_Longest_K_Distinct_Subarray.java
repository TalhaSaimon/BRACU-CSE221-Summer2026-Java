    import java.io.*;
    import java.util.*;
    public class Problem_E_Longest_K_Distinct_Subarray{
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
            int freq[]=new int[n+1];
            int l =0, dst = 0,max=0;

            for(int r=0;r<n;r++){
                if(freq[arr[r]]==0){
                    dst +=1;
                }
                freq[arr[r]]+=1;
                while(k<dst){
                    freq[arr[l]]-=1;
                    if(freq[arr[l]]==0){
                         dst--;
                    }
                    l++;
                }
                int s=r-l+1;
                if(s>max){
                    max=s;
                }

            }
            pw.println(max);
            pw.flush();
        }
    }



