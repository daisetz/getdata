package com.daimler.aftersales.Util;

import org.springframework.security.crypto.codec.Utf8;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.GeneralSecurityException;
import java.util.Base64;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
public class DecodeUtil {

    private static final byte[] key = "12345678".getBytes();

    public static String decode(String data) {
        try {
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(
                    Cipher.DECRYPT_MODE,
                    SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(key)),
                    new IvParameterSpec(key));
            return Utf8.decode(cipher.doFinal(Base64.getDecoder().decode(data)));
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
            return "";
        }

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
