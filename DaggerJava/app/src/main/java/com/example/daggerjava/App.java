package com.example.daggerjava;

import android.app.Application;

import com.example.daggerjava.model.Annotation;

import javax.inject.Inject;

public class App extends Application {
	ApplicationComponent applicationComponent;

	@Inject
	DataManager dataManager;

	@Override
	public void onCreate() {
		super.onCreate();

	}

	private void initApplicationComponent() {
		applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
		applicationComponent.inject(this);
	}
	public DataManager getDataManager(){
		return dataManager;
	}

	public ApplicationComponent getApplicationComponent() {
		return applicationComponent;
	}
}
