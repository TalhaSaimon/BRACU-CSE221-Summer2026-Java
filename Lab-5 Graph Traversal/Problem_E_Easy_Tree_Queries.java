import java.io.*;
import java.util.*;
public class Problem_E_Easy_Tree_Queries{
    public static int v[];
    public static int distance[];
    public static int ans[];
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr= new ArrayList <>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList <>());
        }
        int root=Integer.parseInt(st.nextToken());
        for(int i=0;i<n-1;i++){
           st =new StringTokenizer(br.readLine());
           int v=Integer.parseInt(st.nextToken());
           int e=Integer.parseInt(st.nextToken());
           arr.get(v).add(e);
           arr.get(e).add(v);
        }
        v=new int[n+1];
        distance =new int[n+1];
        ans =new int[n+1];
        Queue<Integer> q =new ArrayDeque<>();
        v[root]=1;
        distance[root]=0;
        q.offer(root);
        while(!q.isEmpty()){
            int vtx=q.poll();
            for(int i=0;i<arr.get(vtx).size();i++){
            int idx=arr.get(vtx).get(i);
            if(v[idx]!=1){
                v[idx]=1;
                q.offer(idx);
                distance[idx]=distance[vtx]+1;
             }

           }
        }


        st =new StringTokenizer(br.readLine());
        int query=Integer.parseInt(st.nextToken());
        for(int i=0;i<query;i++){
            st =new StringTokenizer(br.readLine());
            int r=Integer.parseInt(st.nextToken());
            pw.println(dfs(arr,r));
        }
        pw.flush();
    }
    public static int dfs(ArrayList<ArrayList<Integer>> arr,int r){
        if(ans[r]!=0){
            return ans[r];
        }
        int count=1;
        for(int i=0;i<arr.get(r).size();i++){
            int idx=arr.get(r).get(i);
            if(distance[r]<distance[idx]){
                
                count += dfs(arr,idx);
            }
        }
        ans[r]=count;
        return count;
    }
}
