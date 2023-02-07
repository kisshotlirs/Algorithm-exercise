package hashTable;

import java.util.*;

/**
 * @author mojo
 * @description: 警告一小时内使用相同员工卡大于等于三次的人
 * @date 2023/2/7 0007 21:33
 */
public class L1604 {
    public static void main(String[] args) {
        String[] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};
        System.out.println(new Solution1604().alertNames(keyName, keyTime));
    }
}

class Solution1604 {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        int len = keyName.length;
        Map<String, List<Integer>> map = new HashMap<>(len);
        //将时间放在hash表中
        for (int i = 0; i < len; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            map.putIfAbsent(name,new ArrayList<Integer>());
            int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
            int minute = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
            map.get(name).add(hour*60+minute);
        }

        List<String> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String name : keySet) {
            List<Integer> times = map.get(name);
            Collections.sort(times);
            for (int i = 2; i < times.size(); i++) {
                Integer time1 = times.get(i - 2);
                Integer time2 = times.get(i );
                if (time2-time1<=60){
                    list.add(name);
                    break;
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}