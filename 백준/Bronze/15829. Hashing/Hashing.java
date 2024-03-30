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
    	
    	for(int i =0; i<n; i++) {
    		long num = (long)(crr[i]-96);
    		long d = (long)Math.pow(31, i);
    		num *= (long)d;
    		answer += num;
    	}
    	
    	System.out.println(answer);
    }

}
