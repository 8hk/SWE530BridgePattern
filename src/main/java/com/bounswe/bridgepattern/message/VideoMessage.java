package com.bounswe.bridgepattern.message;

import com.bounswe.bridgepattern.crypto.CryptoOps;

public class VideoMessage extends Message {
    public VideoMessage(CryptoOps cryptoOps) {
        super(cryptoOps);
        System.out.println("CryptoOps initialized for: VideoMessage");
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
