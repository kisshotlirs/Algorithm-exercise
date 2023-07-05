package math;

/**
 * @author: zyl
 * @description: k件物品的最大和
 */
public class L2600 {

    public static void main(String[] args) {

    }

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return k- (k - numOnes);
        } else  {
            return numOnes-(k - numOnes - numZeros);
        }
    }

}
