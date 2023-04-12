package ch02_2;

public class MainTest {
	public static void main(String[] args) {
		String url = "www.naver.com/books?id=100";

		Encoder encoder = new Encoder(new UrlEncoder());
		String result1 = encoder.encode(url);
		System.out.println(result1);

		Encoder encoder2 = new Encoder(new Base64Encoder());
		String result2 = encoder2.encode(url);
		System.out.println(result2);
	}
}
