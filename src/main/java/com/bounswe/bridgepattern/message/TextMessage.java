package com.bounswe.bridgepattern.message;

import com.bounswe.bridgepattern.crypto.CryptoOps;

public class TextMessage extends Message {
    public TextMessage(CryptoOps cryptoOps) {
        super(cryptoOps);
        System.out.println("CryptoOps initialized for: TextMessage");
    }

    @Override
    public void encrypt() {
        cryptoOps.encrypt();
    }

    @Override
    public void decrypt() {
        cryptoOps.decrypt();
    }
}
