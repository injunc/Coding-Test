
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer>[] nodes; 
	static boolean[] vistied;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		// 노드 경로 저장하는 리스트, 방문 노드 확인하는 배열, 노드 이동경로 담는 스택
		nodes = new ArrayList[n + 1];
		vistied = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			nodes[i] = new ArrayList();
		}

		// edge수만큼 반복
		for (int i = 0; i < e; i++) {
			// 해당 노드(인덱스)에 경로 저장 + 반대 경우도 추가
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());

			nodes[n1].add(n2);
			nodes[n2].add(n1);

		}

		int count = 0;

		// 배열 앞에서 부터 순회
		for (int i = 1; i <= n; i++) {
			// 이미 방문했으면 패스
			if (vistied[i] == true) continue;
			
			// 카운트 증감
			count++;
			
			// 스택이 비워질 동안 DFS 수행
			DFS(i);
		}
		System.out.println(count);
	}
	
	
	public static void DFS(int n) {
		if(vistied[n]) return;
		vistied[n] = true;
		for(int nm : nodes[n]) {
			if(!vistied[nm]) DFS(nm);
		}
		
	}
}