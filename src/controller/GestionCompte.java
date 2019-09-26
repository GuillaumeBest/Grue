package controller;


import model.Map_P;
import view.Frm_auth;
import view.Window;

import javax.management.InstanceAlreadyExistsException;

public class GestionCompte implements Observer {
	private static final GestionCompte INSTANCE= new GestionCompte();

	private GestionCompte() {
		
	}

	public static GestionCompte getINSTANCE() {
		return INSTANCE;
	}

	@Override
	public void update(Object param) {
		
		String[] userData = (String[]) param;
		if(userData[0]!= null && userData[1]!= null){
			String requestResult = Map_P.getInstance().selectIDbyLoginPassword(userData[0], userData[1]);
			if(!requestResult.equals("")){
				Window Window = new Window();
			}
			else {
				Frm_auth Frm_auth = new Frm_auth();

			}
			
		}
		
		
	}

}
