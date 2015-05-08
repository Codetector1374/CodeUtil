package cn.codetector.util.IO.Net.Web;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class HTTP {

    public static String HttpContextFromURL(URL url) throws IOException {
        return new Scanner(url.openStream(),"UTF-8").useDelimiter("\\A").next();
    }

    public static String HttpContextFromURL(String url) throws IOException{
        return HTTP.HttpContextFromURL(new URL(url));
    }

}
