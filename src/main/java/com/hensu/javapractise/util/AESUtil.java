package com.hensu.javapractise.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @Author: sh
 * @Description: AESUtil
 * @Date: 8:57 2019/9/6
 */
@Slf4j
public class AESUtil {


    private static final String password = "H5td4OkDFFgZTryi";

    /**
     * AES 加密
     *
     * @param content 需要被加密的字符串
     * @return 密文
     */
    public static String encrypt(String content) {

        try {
            byte[] byteContent = content.getBytes(StandardCharsets.UTF_8);
            Cipher cipher = creatCipher(Cipher.ENCRYPT_MODE);
            byte[] result = cipher.doFinal(byteContent);// 加密
            return new Base64().encodeToString(result);

        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * AES 解密
     *
     * @param content AES加密过过的内容
     * @return 明文
     */
    public static String decrypt(String content) {
        byte[] str = new Base64().decode(content);
        try {
            Cipher cipher = creatCipher(Cipher.DECRYPT_MODE);
            // 初始化为解密模式的密码器
            byte[] result = cipher.doFinal(str);
            // 明文
            return new String(result, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("decrypt ex:" + e.getMessage());
        }
        return null;
    }

    /**
     * 创建密码器
     *
     * @param mode mode
     * @return Cipher
     * @throws NoSuchAlgorithmException 异常不处理，抛出
     * @throws NoSuchPaddingException   异常不处理，抛出
     * @throws InvalidKeyException      异常不处理，抛出
     */
    private static Cipher creatCipher(int mode) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        // 创建AES的Key生产者
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(password.getBytes());
        kgen.init(128, random);
        // 128位的key生产者
        //加密没关系，SecureRandom是生成安全随机数序列，password.getBytes()是种子，只要种子相同，序列就一样，所以解密只要有password就行
        // 根据用户密码，生成一个密钥
        SecretKey secretKey = kgen.generateKey();
        // 返回基本编码格式的密钥
        byte[] enCodeFormat = secretKey.getEncoded();
        // 转换为AES专用密钥
        SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
        // 创建密码器
        Cipher cipher = Cipher.getInstance("AES");
        // 初始化为解密模式的密码器
        cipher.init(mode, key);
        return cipher;
    }

    public static void main(String[] args) throws Exception{
        SmsMsgSendVO smsMsgSendVO = new SmsMsgSendVO();
        smsMsgSendVO.setSealStatus("2");
        smsMsgSendVO.setMsgContent("内容");
        smsMsgSendVO.setPhone("18877889966");
        String json = JSON.toJSONString(smsMsgSendVO);
        String enJson = encrypt(json);
        log.info("JIAMI==="+enJson);
        log.info("JIEMI==="+decrypt(enJson));
    }
}
