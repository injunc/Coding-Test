class Solution {
    public int solution(int a, int b, int n) {
        int num =0;
        
        while(n >= a){ 
            int get =  n/a *b;  // 받은거
            num += get;
            n = n- (n-(n%a)) +get;
        }
        return num;
    }
}