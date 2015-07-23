package cn.codetector.util.IO.Net.Web;

import junit.framework.TestCase;

import java.util.HashMap;

public class URLBuilderTest extends TestCase {

    public void testRawPostDataToString() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("test","jep");
        String data = URLBuilder.RawPostDataToString(map);
        assertEquals(-1,data.indexOf("&"));
        assertEquals(false,data.contains("&"));
        assertEquals(true,data.contains("test"));
        assertEquals(true,data.contains("jep"));
        assertEquals(true,data.contains("="));
        assertEquals("test=jep",data);
    }
}