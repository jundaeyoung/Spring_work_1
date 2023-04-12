package ch02;

public class Button {

	private String name;
	private IButtonListener iButtonListener;

	public Button(String name) {
		this.name = name;
	}

	public void click(String message) {
		if (iButtonListener != null) {
			this.iButtonListener.clickEvent(message);
		}
	}

	public void setiButtonListener(IButtonListener iButtonListener) {
		this.iButtonListener = iButtonListener;
	}

}
