package com.example.daggerkotlin

import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageLoader {
    fun load(url: String, img: ImageView)
        = Picasso.get().load(url).into(img)
}


