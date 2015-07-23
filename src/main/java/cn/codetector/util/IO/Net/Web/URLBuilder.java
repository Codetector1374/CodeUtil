package cn.codetector.util.IO.Net.Web;


import java.util.Map;

public class URLBuilder {
    public static String RawPostDataToString(Map<String,String> rawData){
        String PostData = "";
        for (Map.Entry<String, String> entry : rawData.entrySet()){
            PostData = PostData + entry.getKey()+"="+entry.getValue()+"&";
        }
        return PostData.substring(0,PostData.length()-1);
    }
}
