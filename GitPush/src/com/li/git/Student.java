package com.li.git;

import java.util.List;

public class Student {
	private int id;
	
	public int getId() {
		return id + 10;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void addUser(int id,String Username,String password) {
		//add...
	}
    public void deleteUser(int id) {
    	//delete....
    }
    public void updateUser(int id,String newUsername,String newpassword) {
    	//...
    }
    public List<Object> scanfUser(int pageIndex,int pageSize){
    	return null;
    }
}
