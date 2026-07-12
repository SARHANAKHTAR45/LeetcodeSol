class Solution {
    public String reverseVowels(String s) {
        int l = s.length();
        char[] vowels = new char[l];
        int count = 0;
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels[count++] = ch;
            }
        }
        int left = 0;
        int right = count - 1;
        while (left < right) {
            char temp = vowels[left];
            vowels[left] = vowels[right];
            vowels[right] = temp;
            left++;
            right--;
        }
        StringBuilder ans = new StringBuilder();
        int index = 0;
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ans.append(vowels[index++]);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}