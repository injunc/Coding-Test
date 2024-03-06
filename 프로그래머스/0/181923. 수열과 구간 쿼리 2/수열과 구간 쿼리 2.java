class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        // 배열 순회
        for(int i=0;i< queries.length; i++){
            int r = 1000001;
            // arr 순회(범위 지정)
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                // k보다 크면 최소값 저장 
                if(arr[j]<= queries[i][2]) continue;
                r = Math.min(r, arr[j]);
            }
            if(r == 1000001) r = -1;
            answer[i] = r;
        }
            
        return answer;
    }
}