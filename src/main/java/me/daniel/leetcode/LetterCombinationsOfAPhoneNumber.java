package me.daniel.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    private static Map<String, List<String>> keyPad;
    static {
        Map<String, List<String>> data = new HashMap<>();
        data.put("2", Arrays.asList("a","b","c"));
        data.put("3", Arrays.asList("d","e","f"));
        data.put("4", Arrays.asList("g","h","i"));
        data.put("5", Arrays.asList("j","k","l"));
        data.put("6", Arrays.asList("m","n","o"));
        data.put("7", Arrays.asList("p","q","r","s"));
        data.put("8", Arrays.asList("t","u","v"));
        data.put("9", Arrays.asList("w","x","y","z"));
        data.put("*", Arrays.asList("a","b","c"));
        data.put("0", Collections.singletonList(" "));
        keyPad = Collections.unmodifiableMap(data);
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.trim().isEmpty()) return Collections.emptyList();
        return Arrays.stream(digits.split(""))
                .map(s -> keyPad.get(s))
                .reduce((strings, strings2) -> {
                    List<String> result = new ArrayList<>();
                    strings.forEach(s -> strings2.forEach(s1 -> result.add(s + s1)));
                    return result;
                }).orElseGet(Collections::emptyList);
    }

    public static List<String> advancedLetterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while(ans.peek().length()!=digits.length()){
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length())-'0'];
            for(char c: map.toCharArray()){
                ans.addLast(remove+c);
            }
        }
        return ans;
    }
}
