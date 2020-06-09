package Leetcode;

import java.util.HashMap;

public class Leetcode387 {
    public int firstUniqChar(String s) {
        if (s == null)
            return -1;
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
    }
