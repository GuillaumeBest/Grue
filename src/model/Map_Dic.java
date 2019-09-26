package model;


public class Map_Dic {
    private static final Map_Dic INSTANCE= new Map_Dic();

    public static Map_Dic getInstance(){
        return INSTANCE;
    }

    private Map_Dic(){

    }


    public String selectWord(String word){
        return(CAD.getInstance().GetRows( "SELECT Mot FROM dictionnaire WHERE Mot=\""+word+"\"", ""));
    }
}
