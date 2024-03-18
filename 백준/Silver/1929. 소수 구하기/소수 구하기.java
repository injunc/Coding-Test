import java.util.*;
import java.io.*;

public class Main{
    
    static boolean[] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m  = Integer.parseInt(st.nextToken());
        int n  = Integer.parseInt(st.nextToken());
        
        arr = new boolean[n+1];
        toss(n);
    
        for(int i = m; i<=n; i++){
            if(!arr[i]) System.out.println(i);
        }
    }
    
    public static void toss(int n){
        arr[0] = true;
        arr[1] = true;
        
        for(int i =2; i<= Math.sqrt(n); i++){
            if(arr[i]) continue;
            for(int j =i*2; j<=n; j += i){
                arr[j] = true;
            }
        }
        return ;
    }
}