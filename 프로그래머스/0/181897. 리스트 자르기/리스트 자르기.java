import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] range = new int[3];
        
        // select args by n 
        if(n == 1){
            range[0] = 0;
            range[1] = slicer[1];
        }
        else if(n == 2){
            range[0] = slicer[0];
            range[1] = num_list.length-1;
        }
        else if(n == 3){
            range[0] = slicer[0];
            range[1] = slicer[1];
        }
        else if(n == 4){
            range = slicer;
        }
        
        return slice(range ,num_list);
    }
    
    // function a b c str
    public int[] slice(int[] range, int[] target){
        List<Integer>list = new ArrayList<>();
        
        for(int i =range[0]; i<=range[1]; i+=(1+Math.max(0,range[2]-1))){
            list.add(target[i]);
        }
        return list.stream().mapToInt(g->g).toArray();
    }    
    
}