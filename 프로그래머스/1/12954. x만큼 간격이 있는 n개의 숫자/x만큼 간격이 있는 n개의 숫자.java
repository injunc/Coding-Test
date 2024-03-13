class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        // answer[0] = x;
        // for(int i=1; i<n;i++){
        //     answer[i]= i*x + x;
        //     }
        
        for(int i=0; i<n;i++){
            answer[i] =x;
            x+= answer[0];
        }
        return answer;
    }
}