package array;

import java.util.PriorityQueue;

/**
 * @author mojo
 * @description: 最大平均通过率
 * @date 2023/2/19 0019 20:05
 */
public class L1792 {
    public static void main(String[] args) {

    }
}

class Solution1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> queue = new PriorityQueue<>((a,b)->{
            double x=(a[0]+1)/(a[1]+1)-a[0]/a[1];
            double y=(b[0]+1)/(b[1]+1)-b[0]/b[1];
            return Double.compare(y,x);
        });

        for (int[] aClass : classes) {
            queue.offer(new double[]{aClass[0],aClass[1]});
        }

        for (int i = 0; i < extraStudents; i++) {
            double[] poll = queue.poll();
            double pass = poll[0];
            double total = poll[1];
            queue.offer(new double[]{pass+1,total+1});
        }

        double res = 0;
        for (int i = 0; i < classes.length; i++) {
            double[] poll = queue.poll();
            double pass = poll[0];
            double total = poll[1];
            res = res+pass/total;
        }
        return res/ classes.length;
    }
}