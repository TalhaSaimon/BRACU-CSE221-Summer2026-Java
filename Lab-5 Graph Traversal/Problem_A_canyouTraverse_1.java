import java.io.*;
import java.util.*;
public class Problem_A_canyouTraverse_1{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        PrintWriter pw =new PrintWriter(System.out);
        int n=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=n;i++){
              arr.add(new ArrayList<>());
        }
        int n1=Integer.parseInt(st.nextToken());
        for(int i=0;i<n1;i++){
            st =new StringTokenizer(br.readLine());
            int vtx=Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());
            arr.get(vtx).add(edge);
            arr.get(edge).add(vtx);
        }


        Queue<Integer> q = new ArrayDeque<>();
        int visited[]=new int[n+1];
        visited[1]=1;
        q.offer(1);
        while(!q.isEmpty()){
            int vtx=q.poll();
            pw.print(vtx+" ");
            for(int i=0;i<arr.get(vtx).size();i++){
                int idx=arr.get(vtx).get(i);
                if(visited[idx]!=1){
                    visited[idx]=1;
                    q.offer(idx);
                }
            }
        }
        pw.flush();



    }
}