package com.bounswe.bridgepattern.crypto;

public class RsaOps implements CryptoOps {
    @Override
    public void encrypt() {
        System.out.println("RsaOps Encryption Successfully");
    }

    @Override
    public void decrypt() {
        System.out.println("RsaOps Decryption Successfully");
    }
}
