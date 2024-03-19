class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day  ={"FRI", "SAT", "SUN", "MON", "TUE" , "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int d = b-1;
        // 1 + 해당 월까지 일수 + 당월 일수 
        for(int i=0; i<a-1; i++){
            d+= days[i];
        }
        // %7 해서 요일 배열과 매칭        
        d = d%7;
    
        return day[d];
    }
}