package kr.co.dhflour.emaillist.vo;

public class EmailListVo {
	private long no;
	private String firstName ;
	private String lastName ;
	private String email ;
	
	public EmailListVo() {
		
	}
	
	public EmailListVo (long no, String firstName, String lastName, String email) {
		this.no = no;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastName = lastName;
	}
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "EmailListVo [no=" + no + ", firstName=" + firstName + ", lasttName=" + lastName + ", email=" + email
				+ "]";
	}
	
	

}
