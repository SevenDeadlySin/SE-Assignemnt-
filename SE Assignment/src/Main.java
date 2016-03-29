import java.awt.Button;

import javax.swing.JFrame;


public class Main extends JFrame{

	public static void main(String[] args) {
		new Main("SE Assignment");
	}
	
	public Main(String Title)
	{
		Button btn = new Button("Hello");
		setVisible(true);
		this.add(btn);
		setSize(200,200);
		setTitle(Title);
	}

}
