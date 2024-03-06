class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        // 비트 마스킹     >(1) <(2) =(4) !(8)
        int left = 1;
        int right = left << 1;
        int equ = right << 1;
        int diff = equ << 1;
        
        int mask =0;
        
        // ineq 선별
        if(ineq.equals("<")) mask ^= right;
        else mask ^= left;
        
        // ineq가 선별
        if(eq.equals("=")) mask ^= equ;
        else mask ^= diff;
        
        boolean result= false;
        //마스킹 검사
        // <= (6)
        if(mask == 6) result = (n <= m); 
        // <! (10)
        if(mask == 10) result = (n < m);
        // >= (5)
        if(mask == 5) result = (n >= m);
        // >! (9)
        if(mask == 9) result = (n > m);
        
        return (result)?1:0;
    }
}