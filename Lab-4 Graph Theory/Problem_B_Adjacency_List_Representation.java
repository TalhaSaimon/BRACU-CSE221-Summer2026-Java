import java.io.*;
import java.util.*;
public class Problem_B_Adjacency_List_Representation{
    public static void main(String [] args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw= new PrintWriter(System.out);
          StringTokenizer st =new StringTokenizer(br.readLine());
          int n=Integer.parseInt(st.nextToken());
          ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
          for(int i=0;i<=n;i++){
              arr.add(new ArrayList<>());
            }
          int edge= Integer.parseInt(st.nextToken());
          st =new StringTokenizer(br.readLine());
         StringTokenizer st1 =new StringTokenizer(br.readLine());
         StringTokenizer st2 =new StringTokenizer(br.readLine());
          for(int i=0;i<edge;i++){
               int vtx=Integer.parseInt(st.nextToken());
               int vtx2=Integer.parseInt(st1.nextToken());
               int n2=Integer.parseInt(st2.nextToken()); 
                 arr.get(vtx).add(vtx2);
                 arr.get(vtx).add(n2);
          }
          
          for(int i=1;i<=n;i++){
            pw.print(i+": ");
            for (int j=0;j<arr.get(i).size();j+=2) {
                pw.print("("+arr.get(i).get(j)+","+arr.get(i).get(j+1)+") ");
            }
            pw.println();
          }

           pw.flush();

    }
}






