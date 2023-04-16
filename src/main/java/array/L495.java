package array;

/**
 * @author: zyl
 * @description: 提莫攻击
 */
public class L495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int expireTime = 0;
        int res = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] > expireTime){
                res = res+duration;
            } else {
                res = res + timeSeries[i] - expireTime;
            }
            expireTime = expireTime + duration;
        }
        return res;
    }
}
