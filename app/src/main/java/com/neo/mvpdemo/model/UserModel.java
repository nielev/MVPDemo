package com.neo.mvpdemo.model;

import com.neo.mvpdemo.bean.UserBean;

public class UserModel implements IUserModel {

	@Override
	public void setID(int id) {
		System.out.println(id);
	}

	@Override
	public void setFirstName(String firstName) {
		System.out.println(firstName);
	}

	@Override
	public void setLastName(String lastName) {
		System.out.println(lastName);

	}

	@Override
	public int getID() {
		return 1;
	}

	@Override
	public UserBean load(int id) {
		UserBean bean = null;
		if(1==id){
			bean = new UserBean("haha", "zhangse");
			return bean;
		}
		return null;
	}

}
