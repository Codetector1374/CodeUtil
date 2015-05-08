package cn.codetector.util.IO.Net.Web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Codetector on 15/5/5.
 */
public class HTTPTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHttpContextFromURL() throws Exception {
        assertNotNull(HTTP.HttpContextFromURL("http://www.google.com"));
        System.out.print(HTTP.HttpContextFromURL("http://www.google.com"));
    }

    @Test
    public void testHttpContextFromURL1() throws Exception {
        assertNotNull(HTTP.HttpContextFromURL("http://www.google.com"));
    }
}