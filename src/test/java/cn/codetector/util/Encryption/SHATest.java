package cn.codetector.util.Encryption;

import junit.framework.TestCase;

public class SHATest extends TestCase {

    public void testGetSHA1String() throws Exception {
        assertEquals("3d4f2bf07dc1be38b20cd6e46949a1071f9d0e3d",SHA.getSHA1String("111111"));
        assertEquals("bcb15f821479b4d5772bd0ca866c00ad5f926e3580720659cc80d39c9d09802a",SHA.getSHA256String("111111"));
    }
}