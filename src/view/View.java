package view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import contract.IView;

public class View implements IView {
	
	private Window window;
	
	public View() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		this.setWindow(new Window());
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}
}
