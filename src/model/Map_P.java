package model;


public class Map_P {
    private static final Map_P INSTANCE= new Map_P();

    public static Map_P getInstance(){
        return INSTANCE;
    }

    private Map_P(){

    }


    public int selectIDbyLoginPassword(String login, String password){
        return(CAD.getInstance().GetRows( "SELECT Nom_De_Compte, password FROM identifiant WHERE Nom_De_Compte=\""+login+"\" AND Mot_DE_Passe=\""+password+"\"", 0));
    }
}

