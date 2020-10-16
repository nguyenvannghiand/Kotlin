package com.example.mvvmlogin.interfacecallbacks;

public interface LoginResultCallbacks {
	void onSuccess(String message);

	void onError(String message);
}
