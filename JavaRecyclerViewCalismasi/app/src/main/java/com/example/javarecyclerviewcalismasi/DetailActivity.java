package com.example.javarecyclerviewcalismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javarecyclerviewcalismasi.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();

        LandMark sl=(LandMark) intent.getSerializableExtra("landmark");
        binding.textView2.setText(sl.name);
        binding.textView.setText(sl.country);
        binding.imageView.setImageResource(sl.image);

    }
}