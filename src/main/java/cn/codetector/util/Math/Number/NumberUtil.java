package cn.codetector.util.Math.Number;

public class NumberUtil {
    public static boolean isPrime(int n){
        boolean noFactors = true;

        if (n <= 1){
            return false;
        }
        if (n == 2 || n ==3){
            return true;
        }
        if (isOdd(n) && n%3 != 0){
            for (int m = 5; noFactors; m+=2){
                if (m*m>n){
                    break;
                }
                if (n%m == 0)
                    noFactors = false;
            }
        }else{
            return false;
        }
        return noFactors;
    }
    public static boolean isOdd(int n){
        return !(n%2 == 0);
    }
}
