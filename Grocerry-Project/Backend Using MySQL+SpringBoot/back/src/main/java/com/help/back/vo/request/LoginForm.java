package com.help.back.vo.request;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
	public LoginForm() {
		
	}
	public LoginForm(@NotBlank String username, @NotBlank String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password + "]";
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
}
