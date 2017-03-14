/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSoliution
 * @Use backtrack.
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        //StringBuilder sb = new StringBuilder();
        helper(result, new StringBuilder(), n, 0, 0);
        return result;
    }
    
    private void helper(List<String> result, StringBuilder sb, int n, int leftbra, int rightbra){
        if((leftbra + rightbra) == 2 * n){
            result.add(sb.toString());
            return;
        }
        if(leftbra < n){
            helper(result,sb.append("("),n,leftbra + 1,rightbra);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(rightbra < leftbra){
            helper(result,sb.append(")"),n,leftbra,rightbra + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
