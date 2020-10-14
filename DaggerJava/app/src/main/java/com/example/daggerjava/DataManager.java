package com.example.daggerjava;

import com.example.daggerjava.db.DBHelper;
import com.example.daggerjava.model.Hotgirl;
import com.example.daggerjava.preferences.SharedPrefsHelper;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager {
	DBHelper mDbHelper;
	SharedPrefsHelper mSharedPrefsHelper;

	@Inject
	public DataManager(DBHelper dbHelper, SharedPrefsHelper sharedPrefsHelper) {
		this.mDbHelper = dbHelper;
		this.mSharedPrefsHelper = sharedPrefsHelper;
	}

	public Long addHotGirl(Hotgirl hotgirl) {
		return mDbHelper.insertUser(hotgirl);
	}
	public List<Hotgirl> getAllGirl() throws NullPointerException {
		return mDbHelper.getAllGirl();
	}

	public void clearDatabase() {
		mDbHelper.clearDatabase();
	}

	public void saveAccessToken(String accessToken) {
		mSharedPrefsHelper.put(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, accessToken);
	}

	public String getAccessToken() {
		return mSharedPrefsHelper.get(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, null);
	}

}
