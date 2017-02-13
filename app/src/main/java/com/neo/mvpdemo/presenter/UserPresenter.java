package com.neo.mvpdemo.presenter;


import com.neo.mvpdemo.bean.UserBean;
import com.neo.mvpdemo.model.IUserModel;
import com.neo.mvpdemo.model.UserModel;
import com.neo.mvpdemo.view.IUserView;

public class UserPresenter {
	private IUserView mUserView;
	private IUserModel mUserModel;

	public UserPresenter(IUserView mUserView) {
		this.mUserView = mUserView;
		mUserModel = new UserModel();
	}

	/**
	 * 保存密码
	 *
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public void saveUser(int id, String firstName, String lastName) {
		mUserModel.setID(id);
		mUserModel.setFirstName(firstName);
		mUserModel.setLastName(lastName);
	}

	public void loadUser(int id) {
		UserBean user = mUserModel.load(id);
		mUserView.setFirstName(user.getFirstName()); // 通过调用IUserView的方法来更新显示
		mUserView.setLastName(user.getLastName());
	}
}
