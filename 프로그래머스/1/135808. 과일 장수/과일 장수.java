import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int score1[] = new int[score.length];
		int box = score.length / m;
		
		Arrays.sort(score);
		for(int i=score.length-1; i>=0; i--) {
			score1[score.length-i-1] = score[i];
		}

	    for(int i=0; i< box; i++) {
	    	int[] a = Arrays.copyOfRange(score1, i*m, i*m+m);
	    	int value = Arrays.stream(a).min().getAsInt();
	    	answer += value*m;
	    }
        
        return answer;
    }
}