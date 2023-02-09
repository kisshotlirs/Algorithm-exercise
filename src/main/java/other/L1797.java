package other;

import java.util.HashMap;

/**
 * @author mojo
 * @description: 设计一个验证系统
 * @date 2023/2/9 0009 9:16
 */
public class L1797 {
    public static void main(String[] args) {
        String n = "100";
        n = n+50;
        System.out.println(n);
    }
}

class AuthenticationManager {

    private Integer timeToLive;
    private HashMap<String,Integer> map;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.map = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId,currentTime+timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (map.getOrDefault(tokenId,0)>currentTime){
            map.put(tokenId,currentTime+timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int res = 0;
        for (Integer time : map.values()) {
            if (time>currentTime){
                res++;
            }
        }
        return res;
    }
}