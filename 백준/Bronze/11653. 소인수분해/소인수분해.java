import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int l = (int) Math.sqrt(n);

		// 1 ~ 제곱근
		for (int i = 2; i <= l; i++) {
			// i % == 0 이면
			while (n % i == 0) {
				System.out.println(i);
				n /= i;// /= i i 출력
			}
		}
		if (n != 1) {
			System.out.println(n);
		}
	}
}
