package com.nghianv.databindingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.nghianv.databindingrecyclerview.databinding.ActivityMainBinding;
import com.nghianv.databindingrecyclerview.model.User;

public class MainActivity extends AppCompatActivity {
	private User user;
	private MyClickHandlers handlers;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		user = new User();
		user.setName("Android DataBinding Observable");
		user.setEmail("nguyenvannghiaxda@gmail.com");
		user.setProfileImg("https://api.androidhive.info/images/nature/david.jpg");
		binding.setUser(user);

		handlers = new MyClickHandlers(MainActivity.this);
		binding.setHandlers(handlers);
		//set binding cho layout content_main iclue
		binding.content.setHandlers(handlers);

	}
	public class MyClickHandlers {
		Context context;

		public MyClickHandlers(Context context) {
			this.context = context;
		}

		public void onFabClicked(View view) {
			Toast.makeText(getApplicationContext(), "FAB clicked!", Toast.LENGTH_SHORT).show();
			user.setName("Ravi");
			user.setEmail("ravi8x@gmail.com");
		}

		public void onButtonClick(View view) {
			Toast.makeText(getApplicationContext(), "Button clicked!", Toast.LENGTH_SHORT).show();
		}

		public void onButtonClickWithParam(View view, User user) {
			Toast.makeText(getApplicationContext(), "Button clicked! Name: " + user.getName(), Toast.LENGTH_SHORT).show();
		}

		public boolean onButtonLongPressed(View view) {
			Toast.makeText(getApplicationContext(), "Button long pressed!", Toast.LENGTH_SHORT).show();
			return false;

		}
	}
}