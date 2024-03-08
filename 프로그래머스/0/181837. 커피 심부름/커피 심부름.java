class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        // order loop
        for(String s : order){
            // if anything || americano  + 4500
            if(s.equals("anything") || s.indexOf("americano") != -1) answer+= 4500;
            // if caferlatter + 5000
            else if(s.indexOf("cafelatte") != -1) answer+= 5000;
        }
        
        return answer;
    }
}