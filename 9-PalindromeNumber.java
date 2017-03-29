public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10)
            return true;
        /*
        int bound = 1;
        while(Math.pow(10,bound) <= x){
            bound++;
        }
        if(Math.pow(10,bound - 1) == x)
                return false;
        int res = 0;
        int front = (int)Math.pow(10,bound - 1);
        int end = (int)Math.pow(10,1);
        while(front >= end){
            int temp1 = (x / front) % 10;
            int temp2 = (int) ((x % end) / Math.pow(10,res));
            if(temp1 == temp2){
                front /= 10;
                end *= 10;
                res++;
            }
            else{
                return false;
            }
        }
        return true;
        */
        int rev = 0;
        int temp = x;
        while(x != 0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if(rev != temp)
            return false;
        else return true;
    }
}
