import java.io.*;
import java.util.*;
public class Problem_B_canyouTraverse_2{
    static int[] visited;
    static int a[];
    static int idx=0;
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        PrintWriter pw =new PrintWriter(System.out);
        int n=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }
        StringTokenizer st1 =new StringTokenizer(br.readLine());
        StringTokenizer st2 =new StringTokenizer(br.readLine());
        int n1=Integer.parseInt(st.nextToken());
        for(int i=0;i<n1;i++){
            int vtx=Integer.parseInt(st1.nextToken());
            int edge=Integer.parseInt(st2.nextToken());
            arr.get(vtx).add(edge);
            arr.get(edge).add(vtx);
        }
        visited = new int[n + 1];
        a = new int[n + 1];
        dfs(arr,1);
        for(int i=0;i<idx;i++){
            pw.print(a[i]+" ");
        }
        pw.flush();
    }
    public static void dfs(ArrayList<ArrayList<Integer>> arr,int s){
        visited[s]=1;
        a[idx++]=s;
        for(int i=0;i<arr.get(s).size();i++){
            int vtx=arr.get(s).get(i);
         if(visited[vtx]!=1){
            dfs (arr,vtx);
         }
        }
    }
}