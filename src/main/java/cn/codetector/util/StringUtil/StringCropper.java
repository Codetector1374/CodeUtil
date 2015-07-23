package cn.codetector.util.StringUtil;


public class StringCropper {
    public static String Crop(String string,int head, int tail){
        String s = string.substring(head);
        return s.substring(0,s.length()-tail);
    }
}
