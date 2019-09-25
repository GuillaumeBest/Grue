package model;


import java.sql.*;



public class CLbdd {

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public CLbdd() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/grue?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    ;

    //-------------------------------------------------------
    public String GetRows(String rq_sql, String resultSetName) {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(rq_sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ("1");

    }

    ;

    //-------------------------------------------------------
    public void ActionRows(String rq_sql) {
    }

    ;
}