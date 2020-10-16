package com.example.mvvmlogin.model;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;

import org.w3c.dom.Text;

public class User extends BaseObservable {
	@NonNull
	private String email, password;

	public User() {
	}

	public User(@NonNull String email, @NonNull String password) {
		this.email = email;
		this.password = password;
	}

	@NonNull
	public String getEmail() {
		return email;
	}

	public void setEmail(@NonNull String email) {
		this.email = email;
	}

	@NonNull
	public String getPassword() {
		return password;
	}

	public void setPassword(@NonNull String password) {
		this.password = password;
	}

	public boolean isValidData() {
		return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length() > 6;
	}

	public int isValidedData() {
		if (TextUtils.isEmpty(getEmail())) {
			return 0;
		} else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
			return 1;
		} else if (getPassword().length() < 6) {
			return 2;
		} else {
			return -1;
		}
	}

}
