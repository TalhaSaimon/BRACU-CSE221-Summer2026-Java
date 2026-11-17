import java.io.*;
import java.util.*;
public class Problem_C_LightningMcQueen{
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr= new ArrayList <>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList <>());
        }
        int n1=Integer.parseInt(st.nextToken());
        int src=Integer.parseInt(st.nextToken());
        int end=Integer.parseInt(st.nextToken());
        StringTokenizer st1 =new StringTokenizer(br.readLine());
        StringTokenizer st2 =new StringTokenizer(br.readLine());
        for(int i=0;i<n1;i++){
            int vtx=Integer.parseInt(st1.nextToken());
            int edge=Integer.parseInt(st2.nextToken());
            arr.get(vtx).add(edge);
            arr.get(edge).add(vtx); 
        }
         for(int i=1;i<=n;i++){
            Collections.sort(arr.get(i));
        }
        int v[]=new int[n+1];
        int distance[]=new int[n+1];
        int parent[]=new int[n+1];
        Queue<Integer> q=new ArrayDeque<>();

            v[src]=1;
            parent[src]=-1;
            distance[src]=0;
            q.offer(src);
            while(!q.isEmpty()){
                int vtx=q.poll();
                for(int i=0;i<arr.get(vtx).size();i++){
                    int idx=arr.get(vtx).get(i);
                    if(v[idx] !=1){
                        distance[idx]=distance[vtx]+1;
                        parent[idx]=vtx;
                        v[idx]=1;
                        q.offer(idx);
                    }
                }
            }
            if(v[end]!=1){
                pw.println(-1);
            }
            else{
                pw.println(distance[end]);
                int path[]=new int[distance[end]+1];
                path[0]=end;
                for(int i=1;i<path.length;i++){
                    path[i]=parent[end];
                    end=parent[end];
                }
                for(int i=path.length-1;i>=0;i--){
                    pw.print(path[i]+" ");
                }
            }
            pw.flush();
    }
}