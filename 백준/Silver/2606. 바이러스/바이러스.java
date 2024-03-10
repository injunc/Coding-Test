import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer>[] nodes; 
	static boolean[] vistied;
	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

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

		count = -1;
		DFS(1);
		
		System.out.println(count);
	}
	
	public static void DFS(int n) {
		if(vistied[n]) return;
		count++;
		vistied[n] = true;
		for(int nm : nodes[n]) {
			if(!vistied[nm]) DFS(nm);
		}
	}
}