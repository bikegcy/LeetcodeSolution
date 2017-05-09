/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use String.split("\\+") to divide string.
 */
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] real = a.split("\\+");
        int RealA = Integer.parseInt(real[0]);
        real = real[1].split("i");
        int CompA = Integer.parseInt(real[0]);
        
        real = b.split("\\+");
        int RealB = Integer.parseInt(real[0]);
        real = real[1].split("i");
        int CompB = Integer.parseInt(real[0]);
        
        int Real = RealA * RealB - CompA * CompB;
        int Comp = RealA * CompB + RealB * CompA;
        String result = String.format("%d+%di", Real, Comp);
        return result;
    }
}
