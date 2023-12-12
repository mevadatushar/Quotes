package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.quotes.databinding.ActivityHomePageBinding;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    RecyclerView recyclerview;

    HomePageInterface myInterface;
    ArrayList<HomePageModal> CatogeryName = new ArrayList<>();
    ArrayList<HomePageModal> CatogeryImage = new ArrayList<>();

    ActivityHomePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomePageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initview();
        
    }

    private void initview() {
            HomePageModal m1 = new HomePageModal();
            m1.setCatogeryName("Good Morning");
            m1.setCatogeryImage(R.drawable.morning);
            CatogeryName.add(m1);
            CatogeryImage.add(m1);

        HomePageModal m2 = new HomePageModal();
        m2.setCatogeryName("Good Night");
        m2.setCatogeryImage(R.drawable.night);
        CatogeryName.add(m2);
        CatogeryImage.add(m2);

        HomePageModal m3 = new HomePageModal();
        m3.setCatogeryName("Love");
        m3.setCatogeryImage(R.drawable.love);
        CatogeryName.add(m3);
        CatogeryImage.add(m3);

        HomePageModal m4 = new HomePageModal();
        m4.setCatogeryName("Attitude");
        m4.setCatogeryImage(R.drawable.attitude);
        CatogeryName.add(m4);
        CatogeryImage.add(m4);

        HomePageModal m5 = new HomePageModal();
        m5.setCatogeryName("RelationShip");
        m5.setCatogeryImage(R.drawable.relation);
        CatogeryName.add(m5);
        CatogeryImage.add(m5);

        HomePageModal m6 = new HomePageModal();
        m6.setCatogeryName("Life");
        m6.setCatogeryImage(R.drawable.life);
        CatogeryName.add(m6);
        CatogeryImage.add(m6);

        HomePageModal m7 = new HomePageModal();
        m7.setCatogeryName("Happy");
        m7.setCatogeryImage(R.drawable.happiness);
        CatogeryName.add(m7);
        CatogeryImage.add(m7);

        HomePageModal m8 = new HomePageModal();
        m8.setCatogeryName("Sad");
        m8.setCatogeryImage(R.drawable.sad);
        CatogeryName.add(m8);
        CatogeryImage.add(m8);

        HomePageModal m9 = new HomePageModal();
        m9.setCatogeryName("Motivation");
        m9.setCatogeryImage(R.drawable.motivation);
        CatogeryName.add(m9);
        CatogeryImage.add(m9);

        HomePageModal m10 = new HomePageModal();
        m10.setCatogeryName("Wife");
        m10.setCatogeryImage(R.drawable.bride);
        CatogeryName.add(m10);
        CatogeryImage.add(m10);

        HomePageModal m11 = new HomePageModal();
        m11.setCatogeryName("Valentine Day");
        m11.setCatogeryImage(R.drawable.valentine);
        CatogeryName.add(m11);
        CatogeryImage.add(m11);
/////
        HomePageModal m12 = new HomePageModal();
        m12.setCatogeryName("Husband");
        m12.setCatogeryImage(R.drawable.husband);
        CatogeryName.add(m12);
        CatogeryImage.add(m12);


        HomePageModal m13 = new HomePageModal();
        m13.setCatogeryName("Work");
        m13.setCatogeryImage(R.drawable.work);
        CatogeryName.add(m13);
        CatogeryImage.add(m13);


        HomePageModal m14 = new HomePageModal();
        m14.setCatogeryName("Inspirational");
        m14.setCatogeryImage(R.drawable.inspiration);
        CatogeryName.add(m14);
        CatogeryImage.add(m14);


        HomePageModal m15 = new HomePageModal();
        m15.setCatogeryName("Success");
        m15.setCatogeryImage(R.drawable.success);
        CatogeryName.add(m15);
        CatogeryImage.add(m15);


        HomePageModal m16 = new HomePageModal();
        m16.setCatogeryName("Birthday");
        m16.setCatogeryImage(R.drawable.birthday);
        CatogeryName.add(m16);
        CatogeryImage.add(m16);


        HomePageModal m17 = new HomePageModal();
        m17.setCatogeryName("Friendship");
        m17.setCatogeryImage(R.drawable.friendship);
        CatogeryName.add(m17);
        CatogeryImage.add(m17);


        HomePageModal m18 = new HomePageModal();
        m18.setCatogeryName("Time");
        m18.setCatogeryImage(R.drawable.time);
        CatogeryName.add(m18);
        CatogeryImage.add(m18);


        HomePageInterface myInterface = new HomePageInterface() {

            @Override
            public void onClick(String catogeryName) {
                Intent i = new Intent(HomePageActivity.this, QuotesActivity.class);
                i.putExtra("title",catogeryName);
                startActivity(i);
            }

            @Override
            public void onClick(Integer catogeryImage) {
                Intent i = new Intent(HomePageActivity.this, QuotesActivity.class);
                i.putExtra("title",catogeryImage);
                startActivity(i);
            }
        };


        HomePageAdapter adapter = new HomePageAdapter(this,CatogeryName,CatogeryImage,myInterface);
            binding.recyclerview.setAdapter(adapter);

            GridLayoutManager manager = new GridLayoutManager(this,2, LinearLayoutManager.VERTICAL,false);
            binding.recyclerview.setLayoutManager(manager);

    }


}