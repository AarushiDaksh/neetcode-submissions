class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
        return false;
        }

        char[] f=s.toCharArray();
        char[] sec=t.toCharArray();

        Arrays.sort(f);
        Arrays.sort(sec);

        return Arrays.equals(f,sec);

    }
}
