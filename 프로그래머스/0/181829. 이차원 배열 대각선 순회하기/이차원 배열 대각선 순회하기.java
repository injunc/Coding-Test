class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        // 배열 순회
        for(int i =0; i< board.length; i++){
            for(int j =0; j< board[i].length; j++){
                // i+j <= k 경우에만 합 
                if(i+j>k) continue;
                answer+= board[i][j];
            }
        }
        return answer;
    }
}