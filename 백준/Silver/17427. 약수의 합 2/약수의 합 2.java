import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long count =0;
		
	//	n까지 a의 약수가 되는 갯수는 n/a 또는 1
		
		for(int i =1; i<=n; i++) {
			count += Math.max(n/i, 1)*i;
		}

		System.out.println(count);
	}
}
