package model;


public class Map_Dic {
    private static final Map_Dic INSTANCE= new Map_Dic();

    public static Map_Dic getInstance(){
        return INSTANCE;
    }

    private Map_Dic(){

    }


    public int selectWord(String word){
        return(CAD.getInstance().GetRows( "SELECT Mots FROM disctionnaire WHERE Mots=\""+word+"\"", 0));
    }
}
