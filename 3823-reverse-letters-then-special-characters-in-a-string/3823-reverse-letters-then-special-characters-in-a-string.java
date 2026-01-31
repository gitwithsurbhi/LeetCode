// 
class Solution {
    private boolean isCharacter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // ---- Reverse letters only ----
        int l = 0, r = n - 1;
        while (l < r) {
            while (l < r && !isCharacter(arr[l])) l++;
            while (l < r && !isCharacter(arr[r])) r--;

            if (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        // ---- Reverse special characters only ----
        l = 0;
        r = n - 1;
        while (l < r) {
            while (l < r && isCharacter(arr[l])) l++;
            while (l < r && isCharacter(arr[r])) r--;

            if (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(arr);
    }
}
