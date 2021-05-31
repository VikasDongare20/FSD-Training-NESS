package com.help.back.vo.response;


public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String account;
    private String name;
    private String role;

    public JwtResponse() {
		
	}

	public JwtResponse(String token, String type, String account, String name, String role) {
		super();
		this.token = token;
		this.type = type;
		this.account = account;
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "JwtResponse [token=" + token + ", type=" + type + ", account=" + account + ", name=" + name + ", role="
				+ role + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public JwtResponse(String token, String account, String name, String role) {
        this.account = account;
        this.name = name;
        this.token = token;
        this.role = role;
    }
}
