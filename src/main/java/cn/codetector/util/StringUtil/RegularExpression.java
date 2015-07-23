package cn.codetector.util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static List<String> MatchAll(String pattern, String data){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(data);
        List<String> result = new ArrayList<>();
        while(m.find()){
            result.add(m.group());
        }
        return result;
    }
    public static String MatchFirst(String pattern, String data) {
        return MatchAll(pattern, data).get(0);
    }
}
