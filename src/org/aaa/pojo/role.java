package org.aaa.pojo;

public class role {
	private Integer rid;
	
	private String roleName;

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public role(Integer rid, String roleName) {
		super();
		this.rid = rid;
		this.roleName = roleName;
	}

	

	
	

}
