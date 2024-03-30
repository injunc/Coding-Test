import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	String input = br.readLine();
    	char[] crr = input.toCharArray();
    	
    	long answer = 0;
        long pow =1;
        int r = 31;
        int m = 1234567891;
        
    	for(int i =0; i<n; i++) {
    		long num = (long)(crr[i]-96);
    		answer += num*pow % m;
            pow = pow*r % m;
    	}
    	System.out.println(answer % m);
    }

}