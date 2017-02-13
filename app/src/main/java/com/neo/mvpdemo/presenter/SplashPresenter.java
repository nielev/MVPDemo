package com.neo.mvpdemo.presenter;

import android.content.Context;

import com.neo.mvpdemo.model.INetConnect;
import com.neo.mvpdemo.model.NetConnect;
import com.neo.mvpdemo.view.ISplashView;


public class SplashPresenter {
	private INetConnect mInetConnect;
	private ISplashView mISplashView;

	public SplashPresenter(ISplashView mISplashView) {
		this.mISplashView = mISplashView;
		mInetConnect = new NetConnect();
	}

	public void didFinishLoading(Context context) {
		mISplashView.showProcessBar();
		if (mInetConnect.isNetConnect(context)) {
			mISplashView.startNextActivity();
		} else {
			mISplashView.showNetError();
		}
		mISplashView.hideProcessBar();
	}

}
