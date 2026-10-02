import java.io.*;
import java.util.*;
public class Problem_A_Adjacency_Matrix_Representation{
    public static void main(String [] args)throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw= new PrintWriter(System.out);
          StringTokenizer st =new StringTokenizer(br.readLine());
          int n=Integer.parseInt(st.nextToken());
          int a[][]=new int[n][n];
          int edge= Integer.parseInt(st.nextToken());
          for(int i=0;i<edge;i++){
            st =new StringTokenizer(br.readLine());
                int n1=Integer.parseInt(st.nextToken());
                int n2=Integer.parseInt(st.nextToken());
                int w=Integer.parseInt(st.nextToken());
                a[n1-1][n2-1]=w;
          }
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1){
                   pw.println(a[i][j]) ;
                }
                else{
                pw.print(a[i][j]+" ");
                }
            }
            
          }
          pw.flush();
        }
    }
