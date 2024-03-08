class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        // queries 순회
        for(int[] q : queries){
            // s~e 순회
            for(int i=q[0]; i<= q[1]; i++){
                // i 가 k배수면 증감
                if(i%q[2] == 0) arr[i]++;
            }
        }
        return answer;
    }
}