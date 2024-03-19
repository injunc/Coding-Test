class Solution {
    public int solution(int a, int b, int n) {
        int num =0;
        
        while(n >= a){
            int give = n/ a;    // 반환할거
            int less = n% a;    // 남은거
            int get =  n/a *b;  // 받은거
            num += get;
            n = n- (n-less) +get;
        }
        return num;
    }
}