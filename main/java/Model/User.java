package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private String username;
	private String password;
	private String email;
	private String type;
	private int sdt;

	public User() {
		super();
	}

	public User(String username, String password, String email, String type, int SDT) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.type = type;
		this.sdt = sdt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getsdt() {
		return sdt;
	}

	public void setsdt(int sdt) {
		this.sdt = sdt;
	}
}
