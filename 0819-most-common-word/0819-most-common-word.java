class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        
        String[] arr = paragraph.split("\\s+"); // split by whitespace
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for (String s : banned) {
            set.add(s.toLowerCase());
        }
        
        int max = 0;
        String result = "";
        
        for (String word : arr) {
            if (word.length() == 0 || set.contains(word)) continue;
            
            map.put(word, map.getOrDefault(word, 0) + 1);
            
            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }
        
        return result;
    }
}