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
                if(a1[1] == 0) return -1;
                if(a2[1] == 0) return 1;
                
                return a2[0] - a1[0] ;
            }
        };
        
        Arrays.sort(player, cp);
        
        for(int[] arr : player){
            System.out.println(arr[0] + ":" +arr[1] +" : "+ arr[2] );
        }

        return player[player.length-1][2]*10000 +  
            player[player.length-2][2]*100 +  player[player.length-3][2];
    }
}