package model;

import java.sql.*;


public class CLbdd {

    public CLbdd(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/","root", "");
            Statement stmt = con.createStatement();;
            ResultSet rs= stmt.executeQuery("");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        } catch (Exception e) { System.out.println(e); }

    }


}
