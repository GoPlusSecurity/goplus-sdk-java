package io.gopluslabs.client.auth;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class SignatureOauth {

    public static String signatureSha1(String appKey, Long time, String appSecret) {

        String builder = (appKey + time + appSecret);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(builder.getBytes("UTF-8"));
            return byteToHex(instance.digest());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }


    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
