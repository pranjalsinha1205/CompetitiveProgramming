package day2;

import java.util.HashMap;
public class LongestSubstringProblem {
    public static void main(String[] args) {
        //we will solve this problem using hashmap
        HashMap<Character, Integer> hm = new HashMap<>();
        int x = findLongestUniqueSubstring("abcabcbb");
        System.out.println(x);
    }
    static int findLongestUniqueSubstring(String input){
        int length = input.length();
        int maxLength = 0; //to store the length of the longest unique substring
        int start = 0; //starting index of the current window

        //Hashmap to store the most recent positions of each character
        HashMap<Character, Integer> recentPosition = new HashMap<>();

        //traverse through the string
        for(int end = 0; end < length; end++){
            char currentChar = input.charAt(end);

            //if character is already in the hashmap, move the start index
            if(recentPosition.containsKey(currentChar)){
                start = Math.max(start, recentPosition.get(currentChar) + 1);
            }

            //update the maximum length if the current window is larger
            maxLength = Math.max(maxLength, end-start+1);

            //update the most recent position of the current character
            recentPosition.put(currentChar, end);
        }
        return maxLength;
    }
}
