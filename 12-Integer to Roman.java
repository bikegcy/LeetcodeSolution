public class Solution {
    public String intToRoman(int num) { 
        //罗马数字转换
        //I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
        int[] numUnit = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanUnit = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        String romanResult = "";
        int position = numUnit.length;
        position = position - 1;
        
        while(num != 0){
            while(num >= numUnit[position]){
                num -= numUnit[position];
                romanResult += romanUnit[position];
            }
            position--;
        }
        return romanResult;
    }
}
