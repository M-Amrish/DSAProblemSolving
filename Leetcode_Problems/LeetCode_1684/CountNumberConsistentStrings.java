package Leetcode_Problems.LeetCode_1684;

//    Example 1:
//    Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//    Output: 2
//    Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
//    Example 2:
//
//    Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
//    Output: 7
//    Explanation: All strings are consistent.
//    Example 3:
//
//    Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
//    Output: 4
//    Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

public class CountNumberConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {

        boolean arr[] = new boolean[26];

        for(int i=0; i<allowed.length(); i++){

            arr[allowed.charAt(i) - 'a'] = true;
        }

        int ans = 0;

        for(int i=0; i<words.length; i++){

            if(check(words[i], arr)){
                ans++;
            }
        }

        return ans;

    }


    public boolean check(String str, boolean b[]){

        for(int i=0; i<str.length(); i++){

            if( !b[str.charAt(i) - 'a'] ){
                return false;
            }
        }
        return true;
    }
}
