package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
        String s = "ruler";
        mapFreqOrder(s);
        int num = 1331;

        System.out.println(palindrome(num));
        int[] arr = {-1, 2, 0, 5, 0, 6};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(moveZeros(arr.clone())));

    }

    private static int[] moveZeros(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return arr;
    }

    private static boolean palindrome(int n) {
        int temp = n, ans = 0;
        while (n > 0) {
            int val = n % 10;
            ans = ans * 10 + val;
            n = n / 10;
        }
        return temp == ans;
    }

    private static void mapFreqOrder(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Map.Entry<Character, Integer>> listMap = hashMap.entrySet().stream().sorted((c1, c2) -> c2.getValue() - c1.getValue()).collect(Collectors.toList());
        for (Map.Entry<Character, Integer> entry : listMap) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedHashMap);
    }
}
