package view;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class LoginWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel login = new JPanel();
	private JTextField jtf = new JTextField("");
	private JLabel label = new JLabel("Identifiant :");
	private JLabel MDP = new JLabel("Mot de passe :");
	private JTextField jtf2 = new JTextField("");
	private JButton boutonLog = new JButton("Connexion");
	
	public LoginWindow(){
		this.setTitle("Connexion");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setBackground(Color.white);
	    login.setLayout(new BorderLayout());
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLACK);
	    jtf2.setFont(police);
	    jtf2.setPreferredSize(new Dimension(150, 30));
	    jtf2.setForeground(Color.BLACK);
	    JPanel top = new JPanel();
	    top.add(label);
	    top.add(jtf);
	    top.add(MDP);
	    top.add(jtf2);
	    top.add(boutonLog);
	    login.add(top, BorderLayout.CENTER);
	    this.setContentPane(login);
	    this.setVisible(true); 
	}
}
