package cn.codetector.util.Encryption;

import junit.framework.TestCase;

/**
 * Created by Codetector on 15/8/22.
 */
public class md5Test extends TestCase {

    public void testGetmd5String() throws Exception {
        assertEquals("0cc175b9c0f1b6a831c399e269772661",md5.getmd5String("a"));
        assertEquals("7ac66c0f148de9519b8bd264312c4d64",md5.getmd5String("abcdefg"));
    }
}