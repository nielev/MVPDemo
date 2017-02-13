package com.neo.mvpdemo.bean;
/**
 * 数据Bean类
 * @author Oray
 *
 */
public class UserBean {
	private String mFirstName;
	private String mLastName;

	public UserBean(String mFirstName, String mLastName) {
		super();
		this.mFirstName = mFirstName;
		this.mLastName = mLastName;
	}
	public String getFirstName() {
		return mFirstName;
	}
	public void setFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}
	public String getLastName() {
		return mLastName;
	}
	public void setLastName(String mLastName) {
		this.mLastName = mLastName;
	}

}
