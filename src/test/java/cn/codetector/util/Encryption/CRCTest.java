package cn.codetector.util.Encryption;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Codetector on 15/8/22.
 */
public class CRCTest extends TestCase {
    @Test
    public void testGetCRC32() throws Exception {
        assertEquals("B32E11AA",CRC.getCRC32("Jepa2eqa"));

    }
    @Test
    public void testGetCRC16() throws Exception {
        assertEquals("D486",CRC.getCRC16("Codetectofdfasdfasdfasdfasdfasdfasdfr"));
    }
}