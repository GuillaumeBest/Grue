package view;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Window() {
		this.setTitle("Cryptage");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}
