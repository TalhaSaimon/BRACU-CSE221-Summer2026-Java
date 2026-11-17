import java.io.*;
import java.util.*;
public class Problem_F_Reachability{
    public static int v[];
 //   public static int modifiedarr[];
    public static int curr =1;
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr= new ArrayList <>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList <>());
        }
        int edge=Integer.parseInt(st.nextToken());
        int query=Integer.parseInt(st.nextToken());
        for(int i=0;i<edge;i++){
           st =new StringTokenizer(br.readLine());
           int v=Integer.parseInt(st.nextToken());
           int e=Integer.parseInt(st.nextToken());
           arr.get(v).add(e);
           arr.get(e).add(v);
        }
        v =new int[n+1];
 //       modifiedarr=new int [n+1];
        
        for(int i=1;i<n+1;i++){
            if(v[i]==0){
               dfs(arr,i);
               curr++;
            }
            
        }
        for(int i=0;i<query;i++){
            st =new StringTokenizer(br.readLine());
            int n1=Integer.parseInt(st.nextToken());
            int n2=Integer.parseInt(st.nextToken());
            if(v[n1]==v[n2]){
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }
        pw.flush();
    }
    public static void  dfs(ArrayList<ArrayList<Integer>> arr,int vtx){
        v[vtx]=curr;
  //      modifiedarr[vtx]=curr;
        for(int i:arr.get(vtx)){
            if(v[i]==0){
                dfs(arr,i);
            }
        }
        // for(int i=0;i<arr.get(vtx).size();i++){
        //      int idx=arr.get(vtx).get(i);
        //      if(v[idx]==0){
        //         dfs(arr,curr,idx);
        //      }
        //     }

    }
    
}
