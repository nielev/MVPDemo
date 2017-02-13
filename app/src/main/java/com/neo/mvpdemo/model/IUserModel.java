package com.neo.mvpdemo.model;

import com.neo.mvpdemo.bean.UserBean;

/**
 * 业务逻辑类，处理数据的读写
 * @author Oray
 *
 */
public interface IUserModel {
	void setID(int id);
	void setFirstName(String firstName);
	void setLastName(String lastName);
	int getID();
	UserBean load(int id);//通过id读取user信息,返回一个UserBean
}
