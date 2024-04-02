import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 저장 후 정렬
		List<Integer> arr  =new ArrayList<>();
		int sum = -100;
		
		for(int i =0; i<9; i++) {
			int n = Integer.parseInt(br.readLine());
			arr.add(n);
			sum +=n;
		}
		
		// 총합-100 값을 구한다
		
		// 두개 골라서 총합-100 되는 값 찾아 제거
		boolean find = false;
		int s1 = 0;
		int s2 = 0;
		
		
		for(int i=0; i<8; i++) {
			if(find) break;
			for(int j =i+1; j<9; j++) {
				if(arr.get(i)+ arr.get(j) == sum) {
					s1 = arr.get(i);
					s2 = arr.get(j);
					find = true;
					break;
				}
			}
		}
		
		arr.sort(null);
		
		for(int m : arr) {
			if(m == s1  || m == s2) continue;
			System.out.println(m);
		}
	}
}