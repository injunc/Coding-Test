import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	int answer = 0;
    	
    	//n까지 반복
    	for(int i=1; i<=n; i++) {
    		// 각자리수 + n == m이면 종료
    		if(getSum(i)+i == n) {
    			answer = i;
    			break;
    		} 
    	}
    	System.out.println(answer);
    }
    
    public static int getSum(int i){
    	int r = 0;
    	
    	while(i > 0) {
    		r += i%10;
    		i /=10;
    	}
    	return r;
    }
}