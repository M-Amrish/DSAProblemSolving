package Leetcode_Problems.LeetCode_1945;

public class SumDigitsStringAfterConvert {
    public static void main(String[] args) {
        String str ="iiii";

        int ans = getLucky(str,2);

        System.out.println(ans);
    }

    public static int getLucky(String s, int k) {

        String str = "";
        for(int i=0; i<s.length(); i++){

            str += s.charAt(i) - 'a' +1;
        }

        int ans = 0;

        while(k-- > 0) {
            ans = 0;
            for (char ch : str.toCharArray()) {
                ans += Integer.parseInt(ch + "");
            }

            str = String.valueOf(ans);


        }
        return ans;
    }
}
