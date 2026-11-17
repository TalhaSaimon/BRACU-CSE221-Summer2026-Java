import java.io.*;
import java.util.*;
public class Problem_H_Diamonds_under_W{
    public static void main(String []args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer st =new StringTokenizer(br.readLine());
        int r=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        char arr[][]=new char[r][c];
        int v[][]=new int[r][c];
        
        for(int i=0;i<r;i++){
            String s =br.readLine();
            for(int j=0;j<c;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                if(v[i][j]==0 && arr[i][j]!='#'){
                    int sum=bfs(i,j,v,arr);
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        pw.println(max);
        pw.flush();

    }
    public static int bfs(int r,int c,int[][] v,char[][] arr){
           v[r][c]=1;
           Queue <Integer>q=new ArrayDeque<>();
           int sum=0;
           q.offer(r);
           q.offer(c);
           if(arr[r][c]=='D'){
            sum++;
           }
           int dr[]={0,0,-1,+1};
           int dc[]={-1,+1,0 ,0};
           while(!q.isEmpty()){
            int row=q.poll();
            int col=q.poll();

            for(int i=0;i<4;i++){
                    int realrow=dr[i]+row;
                    int realcol=dc[i]+col;
                     if(realrow>=0 && realcol>=0 && realrow<arr.length && realcol <arr[0].length && 
                        arr[realrow][realcol]!='#'&&v[realrow][realcol]==0){
                            if(arr[realrow][realcol]=='D'){
                                sum++;
                            }
                            q.offer(realrow);
                            q.offer(realcol);
                             v[realrow][realcol]=1;
                        }
                }


            }
           return sum;
    }
}
        