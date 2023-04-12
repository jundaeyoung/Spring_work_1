package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Button button = new Button("button1");
		button.setiButtonListener(new IButtonListener() {

			@Override
			public void clickEvent(String event) {
				System.out.println("콜 백 들어왔어" + event);
			}
		});

		button.click("연습");
		button.click("중");
	}
}
