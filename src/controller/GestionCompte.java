package controller;


import contract.IController;
import contract.IModel;
import contract.IView;
import model.Map_P;
import view.Frm_auth;
import view.Window;

public class GestionCompte implements Observer {
	
	private int requestResult;
	public GestionCompte() {
		
	}

	@Override
	public void update(Object param) {
		
		String[] userData = (String[]) param;
		if(userData[0]!= null && userData[1]!= null){
			
			requestResult = Map_P.getInstance().selectIDbyLoginPassword(userData[0], userData[1]);
			if(requestResult == 1){
				Window Window = new Window();
			}
			else {
				Frm_auth Frm_auth = new Frm_auth();
			}
			
		}
		
		
	}

}
