public class Solution {
    void helper(String s, int startPos, List<String> result, StringBuilder sb, int Segment){
        if(Segment >= 5){
            if(startPos >= s.length()){
                result.add(sb.substring(0,sb.length()-1));
            }
            return;
        }
        for(int endPos = startPos + 1; endPos <= s.length(); endPos++){
            String candidate = s.substring(startPos, endPos);
            if(candidate.startsWith("0") && candidate.length() > 1 || Integer.valueOf(candidate) > 255){
                break;
            }
            sb.append(candidate + ".");
            helper(s, endPos, result, sb, Segment + 1);
            sb.delete(sb.length() - endPos + startPos - 1, sb.length());
        }
    }
    
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String> ();
        StringBuilder sb = new StringBuilder();
        helper(s, 0, result, sb, 1);
        return result;
    }
}
