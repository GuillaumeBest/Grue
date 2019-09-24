package view;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class LoginWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel identifiant = new JPanel();
	private JTextField jtf = new JTextField("Valeur par défaut");
	private JLabel label = new JLabel("Identifiant :");
	
	public LoginWindow(){
		this.setTitle("Connexion");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		identifiant.setBackground(Color.white);
	    identifiant.setLayout(new BorderLayout());
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLUE);
	    JPanel top = new JPanel();
	    top.add(label);
	    top.add(jtf);
	    identifiant.add(top, BorderLayout.NORTH);
	    this.setContentPane(identifiant);
	    this.setVisible(true); 
		
	}

}
