package com.example.daggerjava.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.daggerjava.model.Annotation;
import com.example.daggerjava.model.Hotgirl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DBHelper extends SQLiteOpenHelper {
	public static final String USER_TABLE_NAME = "hotgirls";
	public static final String USER_COLUMN_USER_ID = "id";
	public static final String USER_COLUMN_USER_NAME = "girl_name";
	public static final String USER_COLUMN_USER_AVATAR = "girl_avt";

	@Inject
	public DBHelper(@Annotation.ApplicationContext Context context,
	                @Annotation.DatabaseInfo String dbName,
	                @Annotation.DatabaseInfo Integer version) {
		super(context, dbName, null, version);
	}

	public DBHelper(@Nullable Context context, @Nullable String name,
	                @Nullable SQLiteDatabase.CursorFactory factory,
	                int version) {
		super(context, name, factory, version);
	}

	public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
		super(context, name, factory, version, errorHandler);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		tableCreateStatements(db);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE_NAME);
		onCreate(db);
	}

	private void tableCreateStatements(SQLiteDatabase sqLiteDatabase) {
		try {
			sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "
					+ USER_TABLE_NAME + "("
					+ USER_COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ USER_COLUMN_USER_NAME + " VARCHAR(20), "
					+ USER_COLUMN_USER_AVATAR + " VARCHAR(50))"
			);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Long insertUser(Hotgirl hotgirl) {
		try {
			SQLiteDatabase database = this.getWritableDatabase();
			ContentValues contentValues = new ContentValues();
			contentValues.put(USER_COLUMN_USER_NAME, hotgirl.getName());
			contentValues.put(USER_COLUMN_USER_AVATAR, hotgirl.getAvatar());
			return database.insert(USER_TABLE_NAME, null, contentValues);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
	public List<Hotgirl> getAllGirl() throws  NullPointerException {
		Cursor cursor = null;
		List<Hotgirl> listGirl = new ArrayList<>();
		try {
			SQLiteDatabase db = this.getReadableDatabase();
			cursor = db.rawQuery("SELECT * FROM " + USER_TABLE_NAME, null);

			if (cursor.getCount() > 0) {
				cursor.moveToFirst();
				do {
					String name = cursor.getString(cursor.getColumnIndex(USER_COLUMN_USER_NAME));
					String avatar = cursor.getString(cursor.getColumnIndex(USER_COLUMN_USER_AVATAR));
					Hotgirl hotgirl = new Hotgirl(name, avatar);
					listGirl.add(hotgirl);
				} while (cursor.moveToNext());
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if (cursor != null) {
				cursor.close();
			}
			return listGirl;
		}
	}

	public void clearDatabase() {
		getWritableDatabase().execSQL("DELETE FROM " + USER_TABLE_NAME);
	}
}
