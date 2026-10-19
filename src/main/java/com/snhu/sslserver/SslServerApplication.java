package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@RestController
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
	
	@GetMapping(value = "/hash", produces = "text/plain")
	public String getHash() throws NoSuchAlgorithmException {
		String data = "Alex Moreno";
		
		MessageDigest message = MessageDigest.getInstance("SHA-256");
		
		byte[] bytesToHash = message.digest(data.getBytes(StandardCharsets.UTF_8));
		
		return "Data: " + data + "\n" +
				"Name of Cipher Algorithm Used: SHA-256\n" +
				"Checksum Value: " + bytesToHex(bytesToHash) + "\n";
		
	}
	
	private static String bytesToHex(byte[] bytes) { 
		StringBuilder hex = new StringBuilder();
		
		for (byte value : bytes) {
			hex.append(String.format("%02x",value & 0xff));
		}
		
		return hex.toString();
	}

}
