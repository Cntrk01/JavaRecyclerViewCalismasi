package com.example.javarecyclerviewcalismasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.javarecyclerviewcalismasi.databinding.ActivityDetailBinding;
import com.example.javarecyclerviewcalismasi.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<LandMark> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        arrayList=new ArrayList<>();
        LandMark pisa=new LandMark("Pisa","İtalya",R.drawable.pisa);
        LandMark eyfel=new LandMark("Eyfel","Fransa",R.drawable.eyfel);

        arrayList.add(pisa);
        arrayList.add(eyfel);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter dp=new RecyclerAdapter(arrayList);
        binding.recyclerView.setAdapter(dp);

    }
}