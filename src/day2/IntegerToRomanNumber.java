package day2;

import java.util.HashMap;

public class IntegerToRomanNumber {
    public static void main(String[] args) {
        int num = 34435;
        String roman = intToRoman(num);
        System.out.println(num + ": " + roman);
    }
    public static String intToRoman(int num) {
        int[] integerValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < integerValues.length; i++){
            while(num >= integerValues[i]){
                roman.append(romanNumerals[i]);
                num -= integerValues[i];
            }
        }
        return roman.toString();
    }
}
