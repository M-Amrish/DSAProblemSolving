package Leetcode_Problems.PracticeProblem.Recursion.CheckPalindrome;

public class CheckPalindrome {
    public static void main(String[] args) {
        //String str = "MADAM";
        String str = "amrisha";
        boolean ans = isPalindrome(str,0, str.length()-1 );

        if(ans == true){
            System.out.println("Given String is Palindrome.... :)");
        }else {
            System.out.println("Given String is Not Palindrome.... :)");
        }
    }

    public static boolean isPalindrome(String str, int i, int j){
        if(i > j){
            return  true;
        }

        if(str.charAt(i) == str.charAt(j)){
            return isPalindrome(str, i+1, j-1);
        }else{
            return false;
        }
    }
}
