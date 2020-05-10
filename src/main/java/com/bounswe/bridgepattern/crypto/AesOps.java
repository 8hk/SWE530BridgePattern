package com.bounswe.bridgepattern.crypto;

public class AesOps implements CryptoOps {
    @Override
    public void encrypt() {
        System.out.println("AesOps Encryption Successfully");
    }

    @Override
    public void decrypt() {
        System.out.println("AesOps Decryption Successfully");
    }
}
