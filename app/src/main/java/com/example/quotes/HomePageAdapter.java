package com.example.quotes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.MyviewHolder> {

    HomePageActivity homePageActivity;
    ArrayList<HomePageModal> catogeryName;
    ArrayList<HomePageModal> catogeryImage;
    HomePageInterface myInterface;
    public HomePageAdapter(HomePageActivity homePageActivity, ArrayList<HomePageModal> catogeryName, ArrayList<HomePageModal> catogeryImage, HomePageInterface myInterface) {
        this.homePageActivity=homePageActivity;
        this.catogeryName=catogeryName;
        this.catogeryImage=catogeryImage;
        this.myInterface=myInterface;

    }

    @NonNull
    @Override
    public HomePageAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(homePageActivity).inflate(R.layout.item_file_home_page_gridview,parent,false);
        MyviewHolder my = new MyviewHolder(view);
        return my;
    }

    @Override
    public void onBindViewHolder(@NonNull HomePageAdapter.MyviewHolder holder, int position) {
        final int i = position;
        holder.txtTextHomePage.setText(catogeryName.get(i).getCatogeryName());
        holder.imgIconHomePage.setImageResource(catogeryImage.get(i).getCatogeryImage());

            holder.imgIconHomePage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myInterface.onClick(catogeryName.get(i).getCatogeryName());                }
            });

        holder.txtTextHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myInterface.onClick(catogeryName.get(i).getCatogeryName());
            }
        });


    }

    @Override
    public int getItemCount() {
        return catogeryName.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        ImageView imgIconHomePage;
        TextView txtTextHomePage;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            txtTextHomePage=itemView.findViewById(R.id.txtTextHomePage);
            imgIconHomePage=itemView.findViewById(R.id.imgIconHomePage);

        }
    }
}
