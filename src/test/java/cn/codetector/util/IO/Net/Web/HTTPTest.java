package cn.codetector.util.IO.Net.Web;

import org.junit.Test;

import static org.junit.Assert.*;

public class HTTPTest {
    @Test
    public void testHttpContextFromURL() throws Exception {
        assertNotNull(HTTP.HttpContextFromURL("http://www.baidu.com"));
    }

    @Test
    public void testSendPost() throws Exception {
        HTTPResponse response = HTTP.HttpPost("http://tieba.baidu.com/mo", "", null);
        System.out.println(response.getCookies().getValue());
        System.out.println(response.getContent());
        System.out.println(response.getHeaders());
    }
}