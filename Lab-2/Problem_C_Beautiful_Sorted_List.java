    import java.io.*;
    import java.util.*;
    public class Problem_C_Beautiful_Sorted_List {
        public static void main(String[]args)throws Exception{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw =new PrintWriter (System.out);
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n1=Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            int arr1[]=new int[n1];
            for(int i=0;i<n1;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
            }
            st= new StringTokenizer(br.readLine());
            int n2=Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            int arr2[]=new int[n2];
            for(int i=0;i<n2;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
            }
            int i=0;
            int j=0;
            int idx=0;
            int arr[]=new int[n1+n2];
            while(i<n1 && j<n2){
                if(arr1[i]<arr2[j]){
                arr[idx++]=arr1[i++];
                }
                else{
                    arr[idx++]=arr2[j++];
                }
            }
            while(i<n1){
                arr[idx++]=arr1[i++];
            }
            while(j<n2){
                arr[idx++]=arr2[j++];
            }
            for(int k=0;k<idx;k++){
                if(k==idx-1){
                    pw.print(arr[k]);
                }
                else{
                pw.print(arr[k]+" ");
                }
            }
            pw.flush();

        }
        
    }
