package cn.codetector.util.Encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA {
    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    public static String getSHA1String(String str) {
        String rtnStr= "";
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            byte[] bytes = messageDigest.digest();
            int len = bytes.length;
            StringBuilder buf = new StringBuilder(len * 2);
            for (int j = 0; j<len; j++) {
                buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
                buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
            }
            rtnStr = buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return rtnStr;
    }
    public static String getSHA256String(String str) {
        String rtnStr= "";
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bytes = messageDigest.digest();
            int len = bytes.length;
            StringBuilder buf = new StringBuilder(len * 2);
            for (int j = 0; j<len; j++) {
                buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
                buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
            }
            rtnStr = buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return rtnStr;
    }
}
