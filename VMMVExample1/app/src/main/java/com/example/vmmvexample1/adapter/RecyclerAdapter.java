package com.example.vmmvexample1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.vmmvexample1.R;
import com.example.vmmvexample1.model.NicePlace;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
	private Context context;
	private List<NicePlace> mNicePlaces;

	public RecyclerAdapter(Context context, List<NicePlace> mNicePlaces) {
		this.context = context;
		this.mNicePlaces = mNicePlaces;
	}

	@NonNull
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(context).inflate(R.layout.layout_listitem, parent, false);
		ViewHolder viewHolder = new ViewHolder(view);
		return viewHolder;
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		NicePlace nicePlace = mNicePlaces.get(position);
		((ViewHolder) holder).mTvName.setText(nicePlace.getTitle());

		// Set the image
		RequestOptions defaultOptions = new RequestOptions().error(R.drawable.ic_launcher_background);
		Glide.with(context)
				.setDefaultRequestOptions(defaultOptions)
				.load(nicePlace.getImageUrl())
				.into(((ViewHolder) holder).mImage);
	}

	@Override
	public int getItemCount() {
		return mNicePlaces.size();
	}


	private class ViewHolder extends RecyclerView.ViewHolder{
		private CircleImageView mImage;
		private TextView mTvName;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			mImage = itemView.findViewById(R.id.image);
			mTvName = itemView.findViewById(R.id.tv_name);
		}
	}

}
