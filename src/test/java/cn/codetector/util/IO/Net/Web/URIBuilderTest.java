package cn.codetector.util.IO.Net.Web;

import junit.framework.TestCase;
import org.junit.Test;

public class URIBuilderTest extends TestCase {
    @Test
    public void testURIBuilder(){
        URIBuilder builder = new URIBuilder("http://");
        builder.append("www.baidu.com").appendArg("test");
        assertEquals(builder.toString(),"http://www.baidu.com/test/");
    }
}