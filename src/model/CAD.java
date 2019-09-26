package model;


import java.sql.*;



public class CAD {
    private static final CAD INSTANCE= new CAD();
    private Connection con;
    private Statement stmt;
    private ResultSet rs;


    public static CAD getInstance(){
        return INSTANCE;
    }

    private CAD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/grue?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    //-------------------------------------------------------
    public String GetRows(String rq_sql, String resultSetName) {
        try {
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(rq_sql);
            while(rs.next()){
                resultSetName= this.rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return(resultSetName);
    }

    ;

    //-------------------------------------------------------
    public void ActionRows(String rq_sql) {
        try {
            this.stmt = con.createStatement();
            this.stmt.executeUpdate(rq_sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    ;
}