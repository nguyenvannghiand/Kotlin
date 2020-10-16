package com.example.mvvmlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvmlogin.databinding.ActivityMainBinding;
import com.example.mvvmlogin.interfacecallbacks.LoginResultCallbacks;
import com.example.mvvmlogin.viewmodel.LoginViewModel;
import com.example.mvvmlogin.viewmodel.LoginViewModelFactory;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginResultCallbacks {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		ViewModel viewModel = new ViewModelProvider(this, new LoginViewModelFactory(this)).get(LoginViewModel.class);
		activityMainBinding.setViewModel((LoginViewModel) viewModel);
	}

	@Override
	public void onSuccess(String message) {
		Toasty.success(this, message, Toast.LENGTH_SHORT).show();

	}

	@Override
	public void onError(String message) {
		Toasty.success(this, message, Toast.LENGTH_SHORT).show();
	}
}