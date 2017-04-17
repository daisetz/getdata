package com.daimler.aftersales.Util;

import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
public class DecodeUtil {

    public static String decode(String data, String key) {
        if (data == null)
            return null;
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] buf = new byte[0];
        byte[] bt = new byte[0];
        String s = null;
        try {
            buf = decoder.decodeBuffer(data);
            bt = DESDecode(buf, key.getBytes());
            s = new String(bt,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    private static byte[] DESDecode(byte[] data, byte[] key) throws Exception {
        // 从原始密钥数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);

        // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

        // 用密钥初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, new IvParameterSpec(key));

        return cipher.doFinal(data);
    }

}
