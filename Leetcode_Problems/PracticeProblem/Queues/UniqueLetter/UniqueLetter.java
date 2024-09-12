package Leetcode_Problems.PracticeProblem.Queues.UniqueLetter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class UniqueLetter {

    public static void main(String[] args) {
        String str = "abcabc";

        System.out.println(solve(str));
    }
    public static  String solve(String A) {

        String str = "";

        HashMap<Character, Integer> map = new HashMap<>();

        Queue<Character> qu = new LinkedList<>();

        for(int i=0; i<A.length(); i++){

            char ch = A.charAt(i);

            qu.add(ch);

            if (map.containsKey(ch)){

                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }

            while(qu.size() != 0 && map.get(qu.peek()) > 1 ){

                qu.remove();
            }

            if(qu.size() != 0){
                str += qu.peek();
            }else{
                str += "#";
            }
        }
        return str;
    }
}
