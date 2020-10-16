package com.example.vmmvexample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.vmmvexample1.adapter.RecyclerAdapter;
import com.example.vmmvexample1.model.NicePlace;
import com.example.vmmvexample1.viewmodels.MainActivityViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
	private static final String TAG = "MainActivity";

	private FloatingActionButton mFab;
	private RecyclerView mRecyclerView;
	private RecyclerAdapter mAdapter;
	private ProgressBar mProgressBar;
	private MainActivityViewModel mainActivityViewModel;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		mFab = findViewById(R.id.fab);
		mRecyclerView = findViewById(R.id.recyclerView);
		mProgressBar = findViewById(R.id.progress_bar);
		mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
		mainActivityViewModel.init();

		//
		mainActivityViewModel.getmListNicePlaces().observe(this, new Observer<List<NicePlace>>() {
			@Override
			public void onChanged(List<NicePlace> nicePlaces) {
				mAdapter.notifyDataSetChanged();
			}
		});

		mainActivityViewModel.getIsUpdating().observe(this, new Observer<Boolean>() {
			@Override
			public void onChanged(Boolean aBoolean) {
				if (aBoolean) {
					showProgressBar();
				} else {
					hideProgressBar();
					mRecyclerView.smoothScrollToPosition(mainActivityViewModel.getmListNicePlaces().getValue().size() -1);
				}

			}
		});

		mFab.setOnClickListener(v -> {
			mainActivityViewModel.addNewValue(new NicePlace("https://i.imgur.com/ZcLLrkY.jpg", "Washington"));
		});
		//
		initRecyclerView();
	}

	private void initRecyclerView() {
		mAdapter = new RecyclerAdapter(this, mainActivityViewModel.getmListNicePlaces().getValue());
		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(layoutManager);
		mRecyclerView.setAdapter(mAdapter);
	}

	private void showProgressBar() {
		mProgressBar.setVisibility(View.VISIBLE);
	}

	private void hideProgressBar() {
		mProgressBar.setVisibility(View.GONE);
	}
}