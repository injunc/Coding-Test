import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[][] player = new int[rank.length][3];
        
        for(int i=0; i< rank.length; i++){
            player[i][0] = rank[i];
            player[i][1] = attendance[i]?1:0;
            player[i][2] = i;
        }
        
        Comparator<int[]> cp  = new Comparator<int[]>(){
            
            @Override
            public int compare(int[] a1, int[] a2){
                if(a2[1] == 0) return -1;
                if(a1[1] == 0) return 1;
                
                return a1[0] - a2[0];
            }
        };
        
        Arrays.sort(player, cp);
        
        // for(int[] ap : player){
        //     System.out.println(ap[0]+":"+ap[1]+":"+ap[2]);
        // }
        
        return player[0][2]*10000 + player[1][2]*100 +  player[2][2];
    }
}