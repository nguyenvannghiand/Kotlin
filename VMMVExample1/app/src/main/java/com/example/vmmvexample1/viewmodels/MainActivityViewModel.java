package com.example.vmmvexample1.viewmodels;

import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.vmmvexample1.model.NicePlace;
import com.example.vmmvexample1.model.repositories.NicePlaceRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
	private MutableLiveData<List<NicePlace>> mListNicePlaces;
	private MutableLiveData<Boolean> isUpdating = new MutableLiveData<>();
	private NicePlaceRepository mRepository;

	public void init() {
		if (mListNicePlaces != null) {
			return;
		}
		mRepository = NicePlaceRepository.getInstance();
		mListNicePlaces = mRepository.getNicePlaces();
	}

	public void addNewValue(final NicePlace nicePlace) {
		isUpdating.setValue(true);
		new AsyncTask<Void, Void, Void>() {

			@Override
			protected Void doInBackground(Void... voids) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return null;
			}

			@Override
			protected void onPostExecute(Void aVoid) {
				super.onPostExecute(aVoid);
				List<NicePlace> currentPlaces = mListNicePlaces.getValue();
				currentPlaces.add(nicePlace);
				mListNicePlaces.postValue(currentPlaces);
				isUpdating.postValue(false);
			}
		}.execute();
	}

	public MutableLiveData<List<NicePlace>> getmListNicePlaces() {
		return mListNicePlaces;
	}

	public MutableLiveData<Boolean> getIsUpdating() {
		return isUpdating;
	}

}
