package array;

import java.util.Arrays;

/**
 * @author mojo
 * @description: 心算挑战
 * @date 2023/9/11 0011 20:32
 */
public class L40 {

    public static void main(String[] args) {
        int[] cards = {1,2,8,9};
        System.out.println(new L40().maxmiumScore(cards, 1));
    }

    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int n = cards.length;
        int score = 0;
        for (int i = n - cnt; i < n; i++) {
            score = score + cards[i];
        }

        if (score%2 == 0) {
            return score;
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = n - cnt; i < n; i++) {
                for (int j = n - cnt - 1; j >= 0; j--) {
                    if (cards[i]%2 == 0 && cards[j]%2 != 0) {
                        min = Math.min(min, cards[i]-cards[j]);
                        break;
                    } else if (cards[i] % 2 != 0 && cards[j] % 2 == 0) {
                        min = Math.min(min, cards[i]-cards[j]);
                        break;
                    }
                }
            }
            if (min == Integer.MAX_VALUE) {
                return 0;
            } else {
                return score-min;
            }
        }
    }
}
