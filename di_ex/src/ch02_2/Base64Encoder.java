package ch02_2;

import java.util.Base64;

public class Base64Encoder implements IEncoder {

	@Override
	public String encode(String message) {
		String result = Base64.getEncoder().encodeToString(message.getBytes());
		return result;
	}

}
