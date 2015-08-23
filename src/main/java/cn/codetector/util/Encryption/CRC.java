package cn.codetector.util.Encryption;


import sun.misc.CRC16;

public class CRC {
    public static String getCRC32(String str){
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        byte[] data = str.getBytes();
        crc32.update(data);
        return Long.toHexString(crc32.getValue()).toUpperCase();
    }
    public static String getCRC16(String str){
        CRC16 crc16 = new CRC16();
        byte[] data = str.getBytes();
        for (byte b : data){
            crc16.update(b);
        }
        return Integer.toHexString(crc16.value).toUpperCase();
    }
}
