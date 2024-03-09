import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        myStr = myStr.replaceAll("a", " ");
        myStr = myStr.replaceAll("b", " ");
        myStr = myStr.replaceAll("c", " ");

        
        List<String>list = new ArrayList<>();
        
        for(String s : myStr.split(" ")){
            if(s.length() > 0) list.add(s);
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return (list.size()>0) ? answer : new String[] {"EMPTY"};
        
    }
}