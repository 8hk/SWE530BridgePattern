package com.bounswe.bridgepattern;

import com.bounswe.bridgepattern.crypto.AesOps;
import com.bounswe.bridgepattern.crypto.CryptoOps;
import com.bounswe.bridgepattern.crypto.RsaOps;
import com.bounswe.bridgepattern.message.Message;
import com.bounswe.bridgepattern.message.TextMessage;
import com.bounswe.bridgepattern.message.VideoMessage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgepatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BridgepatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CryptoOps aes = new AesOps();
		Message videoMessage= new VideoMessage(aes);
		videoMessage.encrypt();
		videoMessage.decrypt();

		CryptoOps rsa = new RsaOps();
		Message textMessage= new TextMessage(rsa);
		textMessage.encrypt();
		textMessage.decrypt();

	}
}
