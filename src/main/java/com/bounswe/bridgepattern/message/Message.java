package com.bounswe.bridgepattern.message;

import com.bounswe.bridgepattern.crypto.CryptoOps;

public abstract class Message {
    CryptoOps cryptoOps;
    public Message(CryptoOps cryptoOps){
        this.cryptoOps=cryptoOps;
    }
    abstract public void encrypt();
    abstract public void decrypt();
}
