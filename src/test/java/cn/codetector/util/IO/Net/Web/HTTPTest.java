package cn.codetector.util.IO.Net.Web;

import org.junit.Test;

import static org.junit.Assert.*;

public class HTTPTest {
    @Test
    public void testHttpContextFromURL() throws Exception {
        assertNotNull(HTTP.HttpContextFromURL("http://www.baidu.com"));
    }
}