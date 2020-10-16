package com.example.mvvmlogin.viewmodel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.mvvmlogin.interfacecallbacks.LoginResultCallbacks;
import com.example.mvvmlogin.model.User;

public class LoginViewModel extends ViewModel {
	private User user;
	private LoginResultCallbacks loginResultCallbacks;

	public LoginViewModel(LoginResultCallbacks loginResultCallbacks) {
		this.loginResultCallbacks = loginResultCallbacks;
		this.user = new User();
	}

	// Write method to get Email from EditText and set to user
	public TextWatcher getEmailTextWatcher() {
		return new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {

			}

			@Override
			public void afterTextChanged(Editable s) {
				user.setEmail(s.toString());

			}
		};
	}

	//Write method to get Password from EditText and set to user
	public TextWatcher getPasswordTextWatcher() {
		return new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {

			}

			@Override
			public void afterTextChanged(Editable s) {
				user.setPassword(s.toString());
			}
		};
	}

	// Write method to process Login
	public void onLoginClicked(View view) {
		if (user.isValidData()) {
			loginResultCallbacks.onSuccess("Login Success!!");
		} else {
			loginResultCallbacks.onError("Login error");
		}
	}

	// Write method to process Login
	public void onLoginClickeded(View view) {
		int errorCode = user.isValidedData();
		if (errorCode == 0) {
			loginResultCallbacks.onSuccess("You must enter email address");
		} else if (errorCode == 1) {
			loginResultCallbacks.onError("Your email is invalid");
		} else if (errorCode == 2) {
			loginResultCallbacks.onError("Password lengt must greater than 6 characters");
		} else {
			loginResultCallbacks.onSuccess("Login success");
		}
	}
}
