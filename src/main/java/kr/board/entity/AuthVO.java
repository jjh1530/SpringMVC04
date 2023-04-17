package kr.board.entity;

public class AuthVO {
	private int no;  
	private String memID;
	private String auth;  //회원권한(3가지 부여. ROLE_USER , ROLE_MANAGER, ROLE_ADMIN 등)
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	
}
