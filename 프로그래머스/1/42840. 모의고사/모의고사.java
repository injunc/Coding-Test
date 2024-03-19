import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] count = new int[3];
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i =0; i<answers.length; i++){
            int a = answers[i];
            if(a == p1[i%5]) count[0]++;
            if(a == p2[i%8]) count[1]++;
            if(a == p3[i%10]) count[2]++;
        }
        
        int max = Arrays.stream(count).max().getAsInt();
        
        List<Integer> list = new ArrayList<>();
        for(int i =0; i< count.length; i++){
            if(max == count[i]){
                list.add(i+1);
            }
        }
          
        return list.stream().mapToInt(i->i).toArray();
    }
}