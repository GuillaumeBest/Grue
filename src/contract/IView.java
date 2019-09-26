package contract;

import view.Window;

import javax.swing.*;

public interface IView {
	
	public Window getWindow();
	
	public void setWindow(Window window);

    public Observable getLoginWindow();
}
