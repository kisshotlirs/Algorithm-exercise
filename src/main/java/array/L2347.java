package array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author mojo
 * @description: 最好的扑克手牌
 * @date 2023/2/20 0020 22:20
 */
public class L2347 {
}

class Solution2347 {
    public String bestHand(int[] ranks, char[] suits) {
        HashSet<Character> suitSet = new HashSet<>();
        for (char suit : suits) {
            suitSet.add(suit);
        }
        if (suitSet.size()==1){
            return "Flush";
        }

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int rank : ranks) {
            rankMap.put(rank,rankMap.getOrDefault(rank,0)+1);
        }
        if (rankMap.size()==5){
            return "High Card";
        }
        for (Integer value : rankMap.values()) {
            if (value>2){
                return "Three of a Kind";
            }
        }
        return "Pair";
    }
}