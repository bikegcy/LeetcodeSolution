/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use backtrack.
 */
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        ArrayList<String> CurrStr = new ArrayList<String>();
        backtrack(s,0,result,CurrStr);
        return result;
    }
    
    private void backtrack(String s,int posi,List<List<String>> result, ArrayList<String> CurrStr){
        if(CurrStr.size() > 0 && posi >= s.length()){
            List<String> temp = (ArrayList<String>) CurrStr.clone();
            result.add(temp);
        }
        for(int i = posi;i < s.length();i++){
            if(isPalindrome(s,posi,i)){
                if(i == posi){
                    CurrStr.add(Character.toString(s.charAt(i)));
                }
                else{
                    CurrStr.add(s.substring(posi,i + 1));
                }
                backtrack(s,i + 1,result,CurrStr);
                CurrStr.remove(CurrStr.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s,int front, int end){
        if(front == end)
            return true;
        while(front < end){
            if(s.charAt(front) == s.charAt(end)){
                front++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
