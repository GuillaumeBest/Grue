package view;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public Window() {
		this.setTitle("Cryptage");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);

		this.setContentPane(panel);

		JButton button = new JButton("Choisir un fichier à décrypter"); // Initialisation du bouton qui va ouvrir le selectionneur de fichier
		button.addActionListener(this); //Mise en place du bouton qui prend en charge l'action de cliquer

		JPanel p = new JPanel(); //Mise en place du bouton sur la fen�tre
		panel.add(button);
		
		//setContentPane(p);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser file = new JFileChooser();

		if (file.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) // Affiche le dialogue et v�rifie le
																		// fonctionnement du bouton
			try {

				String absolute = file.getSelectedFile().getAbsolutePath();
				System.out.print(absolute);

				Desktop.getDesktop().open(file.getSelectedFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
