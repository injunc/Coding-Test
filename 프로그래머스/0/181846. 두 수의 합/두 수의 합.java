import java.math.*;

class Solution {
    public String solution(String a, String b) {
        
        BigInteger la = new BigInteger(a);
        BigInteger lb = new BigInteger(b);
        
        la = la.add(lb);
        
        return la.toString();
    }
}