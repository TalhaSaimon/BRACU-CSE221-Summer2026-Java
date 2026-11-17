import java.io.*;
import java.util.*;
public class Problem_G_CycleDetection{
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
        int indegree[]=new int[n+1];
        for(int  i=0;i<edge;i++){
            st =new StringTokenizer(br.readLine());
            int v=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            arr.get(v).add(e);
            indegree[e]++;
        }
        Queue<Integer>q=new ArrayDeque<>();
        for(int i=1;i<n+1;i++){
            if(indegree[i]==0){
               q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int vtx=q.poll();
            count++;
            for(int i:arr.get(vtx)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.offer(i);
                }
            }
        }
        
        if(count==n){
            pw.println("NO");
        }
        else{
            pw.println("YES");
        }
        pw.flush();
    }
}
