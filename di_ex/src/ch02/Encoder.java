package ch02;

// 중간 클래스
public class Encoder {
	private IEncoder iEncoder;

	public void setiEncoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}

	// DI 의존 주입 설정 + 전략 패턴
	public Encoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}

	// 기능
	public String encode(String message) {
		return iEncoder.encode(message);
	}

}// end of class
