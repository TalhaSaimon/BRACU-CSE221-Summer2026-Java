import java.io.*;
import java.util.*;
public class Problem_D_Through_the_Jungle{
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr= new ArrayList <>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList <>());
        }
        int e=Integer.parseInt(st.nextToken());
        int start=Integer.parseInt(st.nextToken());
        int end=Integer.parseInt(st.nextToken());
        int mid=Integer.parseInt(st.nextToken());

        for(int i=0;i<e;i++){
            st =new StringTokenizer(br.readLine());
            int n1=Integer.parseInt(st.nextToken());
            int n2=Integer.parseInt(st.nextToken());
            arr.get(n1).add(n2);
        }
        int [][] r1=bfs(start,n,arr);
        int v1[]=r1[0];
        int distance1[]=r1[1];
        int parent1[]=r1[2];

        int [][] r2=bfs(mid,n,arr);
        int v2[]=r2[0];
        int distance2[]=r2[1];
        int parent2[]=r2[2];

        if(v1[mid]!=1 || v2[end]!=1){
            pw.println(-1);
        }
        else{
            pw.println(distance1[mid]+distance2[end]);
            int path1[]=new int[distance1[mid]+1];
            path1[0]=mid;
            for(int i=1;i<path1.length;i++){
                path1[i]=parent1[mid];
                mid=parent1[mid];
            }
            int path2[]=new int[distance2[end]+1];
            path2[0]=end;
            for(int i=1;i<path2.length;i++){
                path2[i]=parent2[end];
                end=parent2[end];
            }
            for(int i=path1.length-1;i>0;i--){
                 pw.print(path1[i]+" ");
                }
            for(int i=path2.length-1;i>=0;i--){
                pw.print(path2[i]+" ");
            }
        }
        pw.flush();
    }
     public static int[][] bfs(int start,int n, ArrayList<ArrayList<Integer>> arr){
        
        int v[]=new int [n+1];
        int distance[]=new int[n+1];
        int parent[]=new int[n+1];
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(start);
        v[start]=1;
        distance[start]=0;
        parent[start]=-1;
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
        return new int [][]{v,distance,parent};
     }
}
