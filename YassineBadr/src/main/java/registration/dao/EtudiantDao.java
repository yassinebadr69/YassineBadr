package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import registration.model.Etudiant;
import registration.model.Livre;

public class EtudiantDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
	private String dbUname = "root";
	private String dbPassword = "Yassinebadr01";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public boolean check(String username,String password){
		loadDriver(dbDriver);
		Connection con = getConnection();
		boolean status = false;
		String sql = "select * from etudiant where username=? and password=?";
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		status = rs.next() ;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return status;
	}
	
	public String registerEtudiant(Etudiant etudiant){
		
	String INSERT_USERS_SQL ="INSERT INTO etudiant values(?,?,?,?,?,?);";
	String result = "Data entered successfully";;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try (Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project?serverTimezone=UTC", "root", "Yassinebadr01");
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
        preparedStatement.setString(1, etudiant.getNom());
        preparedStatement.setString(2, etudiant.getPrenom());
        preparedStatement.setString(3, etudiant.getEmail());
        preparedStatement.setString(4, etudiant.getPassword());
        preparedStatement.setString(5, etudiant.getContact());
        preparedStatement.setString(6, etudiant.getAddress());
        
        
        System.out.println(preparedStatement);
         preparedStatement.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
		result = "Data not entered";
	}
	return result;}
	
	
	public String AjouterLivre(Livre livre){
		
	String INSERT_USERS_SQL ="INSERT INTO livre values(?,?,?);";
	String result = "Data entered successfully";;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try (Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project?serverTimezone=UTC", "root", "Yassinebadr01");
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
        preparedStatement.setString(1, livre.getCategorie());
        preparedStatement.setString(2, livre.getNom());
        preparedStatement.setString(3, livre.getAuteur());
        
        
        System.out.println(preparedStatement);
         preparedStatement.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
		result = "Data not entered";
	}
	return result;}


	

}
	