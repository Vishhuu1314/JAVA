class Solution {
    public boolean detectCapitalUse(String word) {
       String upper = word.toUpperCase();
       String lower = word.toLowerCase();
       String sub = word.substring(1);
       return word.equals(upper)
       // || word.equals(lower)   [with or without the ans is correct]
        || sub.equals(sub.toLowerCase()); 
    }
}