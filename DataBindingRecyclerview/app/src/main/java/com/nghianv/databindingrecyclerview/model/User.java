package com.nghianv.databindingrecyclerview.model;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.nghianv.databindingrecyclerview.BR;

public class User extends BaseObservable {
	private String name;
	private String email;
	private String profileImg;

	public User() {
	}

	@Bindable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyPropertyChanged(BR.name);
	}

	@Bindable
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		notifyPropertyChanged(BR.email);
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
		notifyPropertyChanged(BR.profileImg);
	}

	@Bindable
	public String getProfileImg() {
		return profileImg;
	}

	@BindingAdapter({"android:profileImg"})
	public static void loadImage(ImageView imageView, String imgUrl) {
		Glide.with(imageView.getContext()).load(imgUrl).into(imageView);
	}
}
