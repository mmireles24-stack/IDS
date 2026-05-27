package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserModel {

	public UserModel() {
		
	}
	
	public ArrayList<User> get() {
		
		ArrayList<User> users = new ArrayList<>();
		String query = "SELECT * FROM users";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Rald1pvk",
				    "u_L6vTpk",
				    "7j0Pia4oMbiR");
			
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				User user = new User();
				
				user.setName(rs.getString("nombre"));
				user.setEmail(rs.getString("correo"));
				user.setPhone(rs.getString("telefono"));
				users.add(user);
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return users;
	}
	
	public boolean update(User user) {
		
		String query = "UPDATE users SET nombre = ?, correo = ?, telefono = ? WHERE id = ?";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Rald1pvk",
				    "u_L6vTpk",
				    "7j0Pia4oMbiR");

			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone());
			ps.setInt(4, user.getId());
			
			int rowsAffected = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return rowsAffected > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return false;
	}
	
	public boolean create(User user) {
		
		String query = "INSERT INTO users (nombre, correo, telefono) VALUES (?, ?, ?)";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Rald1pvk",
				    "u_L6vTpk",
				    "7j0Pia4oMbiR");
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone());
			
			int rowsAffected = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return rowsAffected > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return false;
	}
	
	public boolean delete(int id) {
		
		String query = "DELETE FROM users WHERE id = ?";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Rald1pvk",
				    "u_L6vTpk",
				    "7j0Pia4oMbiR");

			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			int rowsAffected = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return rowsAffected > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return false;
	}
}

