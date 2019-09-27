package view;

import javax.swing.JTextField;

import contract.Observable;
import controller.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frm_auth extends JFrame implements ActionListener, Observable {
	
	private static final long serialVersionUID = 1L;
	private JPanel login = new JPanel();
	private JTextField jtf = new JTextField("");
	private JLabel label = new JLabel("Identifiant :");
	private JLabel MDP = new JLabel("Mot de passe :");
	private JPasswordField jtf2 = new JPasswordField("");
	private JButton boutonLog = new JButton("Connexion");
	private ArrayList<Observer>observers = new ArrayList<>();
	public String logID;
	public String logMDP;
	
	public Frm_auth (){
		
		// paramètres de la page qui connexion.
		this.setTitle("Connexion");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//paramètre des composants de la page
		login.setBackground(Color.white);
	    login.setLayout(new BorderLayout());
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLACK);
	    jtf2.setFont(police);
	    jtf2.setPreferredSize(new Dimension(150, 30));
	    jtf2.setForeground(Color.BLACK);
	    
	    //positionnement des composants
	    JPanel top = new JPanel();
	    top.add(label);
	    top.add(jtf);
	    top.add(MDP);
	    top.add(jtf2);
	    top.add(boutonLog);
	    login.add(top, BorderLayout.CENTER);
	    
	    // action du bouton
	    boutonLog.addActionListener(this);
	    
	    //affichage de la page
	    this.setContentPane(login);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		  if(arg0.getSource() == boutonLog)
			
			  logID = jtf.getText();
		  	  logMDP = jtf2.getText();
		  	  updateAllObservers();
		  	  this.setVisible(false);
		  	  this.repaint();
	}
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	private void updateAllObservers() {
		for(Observer observer: observers ) {
			observer.update(new String[] {logID,logMDP});
		}
	}
}
