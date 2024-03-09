import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        myStr = myStr.replaceAll("[abc]", " ");
        
        List<String>list = new ArrayList<>();
        
        for(String s : myStr.split(" ")){
            if(s.length() > 0) list.add(s);
        }
        
        return (list.size()>0) ?   list.stream().toArray(String[]::new)   : new String[] {"EMPTY"};
        
    }
}