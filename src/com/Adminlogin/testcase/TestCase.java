package com.Adminlogin.testcase;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;



import com.Adminlogin.database.AccountLogin;
import com.Adminlogin.database.Adminlogin;
import com.Adminlogin.database.Facultylogin;
import com.Adminlogin.database.Studentlogin;
public class TestCase {


	
	
	public void AccountantLogIn() throws SQLException{
		boolean newBal=AccountLogin.logIn("Hari@123", "H@123"); assertEquals(true, newBal);  }
	
	
	public void AccountantLogInStd() throws SQLException{
		boolean newBal=AccountLogin.stdlogIn("BTyyf66", "XII");     assertEquals(true, newBal);  }
	
	
	public void FacultyLogIn() throws SQLException{
		boolean newBal=Facultylogin.logIn("Madhu@gamil.com","Ma@123");     assertEquals(true, newBal);  }
	
	
	public void FacultyLogIn3() throws SQLException{
		assertEquals("true",String.valueOf(Facultylogin.logIn("Madhu@gamil.com","Ma@123")));  }
	

	public void AdminLogInCheck() throws SQLException{
		boolean newBal=Adminlogin.logIn("Hari@1263", "H@123");     assertEquals(false, newBal);  }
	
	
	public void AdminLogInCheck1() throws SQLException{
		boolean newBal=Adminlogin.logIn("sidarth31@gmail.com", "Sid@123");assertEquals(true, newBal);  }
	
	
	public void AdminLogInCheck2() throws SQLException{
		boolean newBal=Adminlogin.logIn("Priya31@gmail.com", "mohan@123");    assertEquals(true, newBal);  }
	
	
	public void StdLogInCheck() throws SQLException{
		boolean newBal=Studentlogin.logIn("BSSDDEE3E3","local@12");     assertEquals(true, newBal);  }
	
	
	public void StdLogInCheck2() throws SQLException{
		boolean newBal=Studentlogin.marksheet("ADSWF76JS");assertEquals(true, newBal);  }
	
	
	  
	
}

