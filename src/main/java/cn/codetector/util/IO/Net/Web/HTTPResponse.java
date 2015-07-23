package cn.codetector.util.IO.Net.Web;

import java.net.*;
import java.util.HashMap;
import java.util.List;

public class HTTPResponse {
    private String Content;
    private HttpCookie Cookies;
    private HashMap<String,String> Headers;
    private int ResponseCode;
    private long ContentLength;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public HttpCookie getCookies() {
        return Cookies;
    }

    public void setCookies(String cookies){
        HttpCookie cookie = new HttpCookie("Cookie",cookies);
        setCookies(cookie);
    }

    public void setCookies(List<String> cookies){
        StringBuilder sb = new StringBuilder();
        for (String s: cookies){
            sb.append(s);
            sb.append(" ");
        }
        String cookieStr = sb.toString();
        HttpCookie cookie = new HttpCookie("Cookie",cookieStr.substring(0,cookieStr.length()-1));
        setCookies(cookie);
    }

    public void setCookies(HttpCookie cookies) {
        Cookies = cookies;
    }

    public HashMap<String, String> getHeaders() {
        return Headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        Headers = headers;
    }
    public void setHeader(String key, String value) {
        if(this.Headers == null){
            this.Headers = new HashMap<>();
        }
        this.Headers.put(key,value);
    }

    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public long getContentLength() {
        return ContentLength;
    }

    public void setContentLength(long contentLength) {
        ContentLength = contentLength;
    }
}
