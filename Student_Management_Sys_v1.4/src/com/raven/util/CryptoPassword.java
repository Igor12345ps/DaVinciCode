/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.util;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptoPassword {
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String FIXED_IV = "1234567890123456"; // IV fixo (não recomendado para produção)
    private static final String FIXED_KEY = "MyFixedSecretKey"; // Chave fixa (não recomendado para produção)
    private static CryptoPassword instance;
    private SecretKey secretKey;
    private IvParameterSpec ivParameterSpec;

    private CryptoPassword() throws Exception {
        this.secretKey = generateSecretKey();
        this.ivParameterSpec = generateIv();
    }

    public static CryptoPassword getInstance() throws Exception {
        if (instance == null) {
            instance = new CryptoPassword();
        }
        return instance;
    }

    private SecretKey generateSecretKey() throws Exception {
        // Usando uma chave fixa
        byte[] keyBytes = FIXED_KEY.getBytes();
        return new SecretKeySpec(keyBytes, ALGORITHM);
    }

    private IvParameterSpec generateIv() {
        // Usando um IV fixo
        byte[] iv = FIXED_IV.getBytes();
        return new IvParameterSpec(iv);
    }

    public String encrypt(String password) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
        byte[] encryptedBytes = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String decrypt(String encryptedPassword) throws Exception {
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
