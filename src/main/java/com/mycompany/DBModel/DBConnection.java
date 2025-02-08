/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DBModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author FAYA COMPUTER
 */
public class DBConnection {
     private static final String DB_URL="jdbc:mysql://localhost/employee";
  private static final String DB_USER="root";
  private static final String DB_PASSWORD="";
  private Connection con1;
  
  public DBConnection(){
      try{
          con1=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
      }catch(SQLException e){
          System.out.println("Error connecting to database: "+e.getLocalizedMessage());
      }
  }
  
  public Connection getConnection(){
      return con1;
  }
  
  public void closeConnection(){
      try{
        if(con1 !=null){
            con1.close();
        }
      }catch(SQLException e){
       System.out.println("Error closing database connection "+ e.getMessage());
      }
  }
}
