public class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            return (1 / myPow(x,-n));
        }
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        double temp = 1;
        if(n % 2 == 0){
            temp = myPow(x,n / 2);
            return temp * temp;
        }//even number
        else{
            temp = myPow(x,n / 2);
            return  temp * temp * x;
        }//odd number
        /* iteration
        public void myPow(double x, int n) {
	    double result = 1;
	    long m = (long) ((n >= 0) ? n : -n);
	    while (m > 0) {
	        if ((m & 1) == 1) {   //m is odd number
	            result *= x;
	        }
	        
	        x *= x;
	        m >>= 1;
	    }
	    
	    return n >= 0 ? result : 1 / result;
	    }
	    */////
    }
}
