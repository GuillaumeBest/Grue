package view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import contract.IView;

public class View implements IView {

	private Window window;
	private Frm_auth loginWindow;

	public View() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		this.setLoginWindow(new Frm_auth());
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	private Frm_auth getLoginWindow() {
		return loginWindow;
	}

	private void setLoginWindow(Frm_auth loginWindow) {
		this.loginWindow = loginWindow;
	}
}
