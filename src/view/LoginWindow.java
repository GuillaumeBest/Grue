package view;

import javax.swing.JFrame;

public class LoginWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public LoginWindow(){
		this.setTitle("Connexion");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}

}
