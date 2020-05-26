package kr.co.goott.dto;

public class MemberDTO {
	private String id;
	private String pwd;
	private String confirm;
	private String email;
	
	public MemberDTO() {}

	public MemberDTO(String id, String pwd, String confirm, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.confirm = confirm;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
