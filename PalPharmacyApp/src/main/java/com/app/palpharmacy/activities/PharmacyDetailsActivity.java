package com.app.palpharmacy.activities;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.app.palpharmacy.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class PharmacyDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        // hide the default actionbar
        getSupportActionBar().hide();

        // Recieve data

        String name = getIntent().getExtras().getString("anime_name");
        String description = getIntent().getExtras().getString("anime_description");
        String city = getIntent().getExtras().getString("anime_city");
        int nb_episode = getIntent().getExtras().getInt("anime_nb_episode");
        String image_url = getIntent().getExtras().getString("anime_img");

        // ini views

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_name = findViewById(R.id.aa_anime_name);
        TextView tv_city = findViewById(R.id.city);
        TextView tv_description = findViewById(R.id.aa_description);
        ImageView img = findViewById(R.id.aa_thumbnail);

        // setting values to each view

        tv_name.setText(name);
//        tv_city.setText(city);
        tv_description.setText(description);


        collapsingToolbarLayout.setTitle(name);


        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);


        // set image using Glide
        Glide.with(this).load(image_url).apply(requestOptions).into(img);

    }
}
