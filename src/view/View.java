package view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import contract.IView;

public class View implements IView {
	
	private Window window;
	private LoginWindow loginWindow;
	
	public View() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		this.setLoginWindow(new LoginWindow());
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	private LoginWindow getLoginWindow() {
		return loginWindow;
	}

	private void setLoginWindow(LoginWindow loginWindow) {
		this.loginWindow = loginWindow;
	}
}
