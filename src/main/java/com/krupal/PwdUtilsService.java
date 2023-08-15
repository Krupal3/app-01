package com.krupal;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PwdUtilsService {
	public static String encoder(String text) {
		Encoder encoder2 = Base64.getEncoder();
		return encoder2.encodeToString(text.getBytes());
	}

	public static String decoder(String encodedText) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedText);

		return new String(decode);
	}

	
	}

