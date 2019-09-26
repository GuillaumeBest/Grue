package controller;

import contract.IController;
import contract.IModel;
import contract.IView;

public class Controller implements IController{
	
	private final IModel model;
	private final IView view;

	public Controller(IModel model, IView view) {
		
		this.model = model;
		this.view = view;
		this.view.getLoginWindow().addObserver(GestionCompte.getINSTANCE());
	}
	
	public void loadDatas() {
		
	}
	
	public void launchApplication() {
		
	}
}