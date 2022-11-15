package com.Adminlogin.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AccountLogin
 {
	static Connection con=Conn.connect();
 	public static boolean logIn(String LoginId,String Passward) {
		try {
		PreparedStatement pd=con.prepareStatement("select * from accountant where login=? and pass_word=?;");
		pd.setString(1, LoginId);
		pd.setString(2, Passward);
		ResultSet result=pd.executeQuery();
		result.next();
		if(result.getString(1)!=null && result.getString(2)!=null) 
		{  return true; } 
		else   
		{   return false;  }
		}catch(Exception e) {return false;}}
 	public static boolean stdlogIn(String stdLoginId,String classs)  {
		try {
		PreparedStatement pd=con.prepareStatement("select * from studentTable where studentID=? and class=?;");
		pd.setString(1, stdLoginId);
		pd.setString(2, classs);
		ResultSet result=pd.executeQuery();
		result.next();
		if(result.getString(1)!=null && result.getString(2)!=null) 
		{  return true; } 
		else   
		{   return false;  }
		}catch(Exception e) {return false;}}
 	public static boolean accLogIn(String accountantID) {
 		try {
 			PreparedStatement pd=con.prepareStatement("select * from accountant where login=?;");
 			pd.setString(1, accountantID);
 			ResultSet result=pd.executeQuery();
 			result.next();
 			if(result.getString(1)!=null && result.getString(2)!=null) 
 			{  return true; } 
 			else   
 			{   return false;  }
 			}catch(Exception e) {return false;}}
 
}
 
