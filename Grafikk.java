

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Grafikk", 500, 500);
		drawCircle(150, 70, 60);
		drawCircle(270, 70, 60);
	}
}