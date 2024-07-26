/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Just Share
 */
public class jdbc {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl ="jdbc:sqlserver://localhost:1434;encrypt=false;database=EduSys";
    static String user = "sa";
    static String pass = "123123123";
    

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement getStmt(String sql, Object...args)throws SQLException{
      Connection conn = DriverManager.getConnection(dburl,user,pass);
      PreparedStatement stmt;
      if(sql.trim().startsWith("{")){
          stmt = conn.prepareCall(sql);//proc
      }else{
          stmt = conn.prepareStatement(sql);//SQL
      }
      for(int i =0;i<args.length;i++){
          stmt.setObject(i+1, args[i]);
      }
      return stmt;
    }
    
    public static ResultSet query(String sql, Object...args)throws SQLException{
        PreparedStatement stmt = jdbc.getStmt(sql, args);
        return stmt.executeQuery();
    }
    
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = jdbc.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int update(String sql, Object...args){
        try {
            PreparedStatement stmt = jdbc.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            }
            finally{
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
