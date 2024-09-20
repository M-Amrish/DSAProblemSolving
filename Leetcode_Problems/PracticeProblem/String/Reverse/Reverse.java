package Leetcode_Problems.PracticeProblem.String.Reverse;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(solve("the sky is blue"));
    }

    public static String solve(String A) {
        String rev = "";

        //Breaking the sentence into words
        String s[] = A.split(" ");

        //Adding the words stored in the array to the last
        for(int i=0;i<s.length;i++){
            if(s[i] != null){
                rev =s[i]+rev;
            }
            if(s.length-1>i){
                rev =" "+rev;
            }
        }
        return rev.trim();
    }

}
