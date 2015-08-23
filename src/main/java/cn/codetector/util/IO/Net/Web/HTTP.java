package cn.codetector.util.IO.Net.Web;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class HTTP {
    public static String HttpContextFromURL(URL url) throws IOException {
        return new Scanner(url.openStream(),"UTF-8").useDelimiter("\\A").next();
    }

    public static String HttpContextFromURL(String url) throws IOException{
        return HTTP.HttpContextFromURL(new URL(url));
    }

    public static HTTPResponse HttpGet(String URL, String get, HashMap<String, String> Headers) throws Exception{
        HTTPResponse response = new HTTPResponse();

        URL url = new URL(URL+"?"+get);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestProperty("Content-Type", "text/html;charset=UTF-8");
        urlConnection.setDoOutput(true);
        urlConnection.connect();

        response.setResponseCode(urlConnection.getResponseCode());
        Map<String , List<String>> map = urlConnection.getHeaderFields();
        for (Map.Entry<String , List<String>> entry : map.entrySet()){
            if (entry.getKey() !=null && entry.getKey().equals("Set-Cookie")){
                response.setCookies(entry.getValue());
            }else{
                response.setHeader(entry.getKey(), entry.getValue().get(0));
            }
        }

        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line;
        String Result = "";
        while ((line = reader.readLine())!=null){
            Result += line;
        }

        reader.close();
        inputStreamReader.close();
        inputStream.close();

        response.setContent(Result);

        return response;
    }

    public static HTTPResponse HttpPost(String URL, String post, HashMap<String, String> Headers) throws Exception {
        URL url = new URL(URL);

        byte[] bytes = post.getBytes(Charset.forName("UTF-8"));

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        urlConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
        if(Headers != null && Headers.size()>0){
            for (Map.Entry<String, String> entry : Headers.entrySet()){
                urlConnection.setRequestProperty(entry.getKey(),entry.getValue());
            }
        }
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        urlConnection.setUseCaches(false);
        urlConnection.setRequestMethod("POST");
        urlConnection.connect();
        OutputStream outputStream = urlConnection.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
        HTTPResponse response = new HTTPResponse();
        response.setResponseCode(urlConnection.getResponseCode());
        Map<String , List<String>> map = urlConnection.getHeaderFields();
        for (Map.Entry<String , List<String>> entry : map.entrySet()){
            if (entry.getKey() !=null && entry.getKey().equals("Set-Cookie")){
                response.setCookies(entry.getValue());
            }else{
                response.setHeader(entry.getKey(), entry.getValue().get(0));
            }
        }

        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line;
        String Result = "";
        while ((line = reader.readLine())!=null){
            Result += line;
        }

        reader.close();
        inputStreamReader.close();
        inputStream.close();

        response.setContent(Result);

        return response;
    }


}
