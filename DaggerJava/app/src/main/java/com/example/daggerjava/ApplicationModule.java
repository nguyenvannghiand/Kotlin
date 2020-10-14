package com.example.daggerjava;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.daggerjava.App;
import com.example.daggerjava.model.Annotation;

import dagger.Module;
import dagger.Provides;
@Module
public class ApplicationModule {
	App application;

	public ApplicationModule(App application) {
		this.application = application;
	}

	@Provides
	@Annotation.ApplicationContext
	public Context provideApplicationContext() {
		return application;
	}

	@Provides
	@Annotation.DatabaseInfo
	public String provideDBName() {
		return "DaggerExample-DB";
	}

	@Provides
	@Annotation.DatabaseInfo
	public Integer provideDBVersion() {
		return 1;
	}

	@Provides
	public SharedPreferences provideSharedPreference() {
		return application.getSharedPreferences("DaggerExample-SharedPrefs", Context.MODE_PRIVATE);
	}
}
