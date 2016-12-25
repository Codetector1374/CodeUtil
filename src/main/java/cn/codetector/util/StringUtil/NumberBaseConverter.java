package cn.codetector.util.StringUtil;

/**
 * Created by codetector on 25/12/2016.
 */
public class NumberBaseConverter {
    public static String numberToString(long number, int radix){
        return Long.toString(number, radix);
    }
}
