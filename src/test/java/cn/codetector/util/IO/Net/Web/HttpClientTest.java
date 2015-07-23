package cn.codetector.util.IO.Net.Web;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by fengp on 2015/7/23.
 */
public class HttpClientTest extends TestCase {
    @Test
    public void testGet() throws Exception {
    }
    @Test
    public void testPost() throws Exception {
        new HttpClient().post("http://backup.cubecraft.cn/test.php","","utf-8");
    }
}