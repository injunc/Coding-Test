import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] a = {};
        String str = "";
        
        for(String s : str_list) str += s;
        
        int index1 = str.indexOf("l");
        int index2 = str.indexOf("r");
        
        if(index1+index2 == -2) return a;
        
        index2 = index2==-1?21:index2;
        index1 = index1==-1?21:index1;
        int index = Math.min(index1, index2);
        
        if(str_list[index].equals("r")){
            return Arrays.copyOfRange(str_list, index+1, str_list.length);
        }else{
            return Arrays.copyOfRange(str_list, 0, index);
        }
    }
}