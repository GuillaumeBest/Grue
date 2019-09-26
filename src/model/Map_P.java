package model;


public class Map_P {
    private static final Map_P INSTANCE= new Map_P();

    public static Map_P getInstance(){
        return INSTANCE;
    }

    private Map_P(){

    }


    public String selectIDbyLoginPassword(String login, String password){
        return(CAD.getInstance().GetRows( "SELECT id, Nom_De_Compte, Mots_De_Passe FROM identifiant WHERE Nom_De_Compte=\""+ login +"\"  AND Mots_De_Passe=\""+ password +"\" ;", ""));
    }
}

