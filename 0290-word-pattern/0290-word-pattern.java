class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
            return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch1 = pattern.charAt(i);
            String str = arr[i];
            if (map1.containsKey(ch1)) {
                if (!map1.get(ch1).equals(str))
                    return false;
            } else {
                map1.put(ch1, str);

            }
            if (map2.containsKey(str)) {
                if (!map2.get(str).equals(ch1))
                    return false;

            }
             else {

                map2.put(str, ch1);
            }
        }
        return true;
    }
}