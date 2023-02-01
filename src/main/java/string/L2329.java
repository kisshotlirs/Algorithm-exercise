package string;

import java.util.HashMap;

/**
 * @author mojo
 * @description: 解密消息
 * @date 2023/2/1 0001 19:35
 */
public class L2329 {
}

class Solution2329 {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>(key.length());
        char cur = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i)!=' ' && !map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),cur);
                cur++;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' '){
                stringBuffer.append(c);
            } else {
                stringBuffer.append(map.get(c));
            }
        }
        return stringBuffer.toString();

    }
}