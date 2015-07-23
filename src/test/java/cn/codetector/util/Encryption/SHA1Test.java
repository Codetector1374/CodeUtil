package cn.codetector.util.Encryption;

import junit.framework.TestCase;

public class SHA1Test extends TestCase {

    public void testGetSHA1String() throws Exception {
        assertEquals(SHA1.getSHA1String("111111"), "3d4f2bf07dc1be38b20cd6e46949a1071f9d0e3d");
    }
}