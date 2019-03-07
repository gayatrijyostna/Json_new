package com.example.json_new;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolderClass> {
    Context context;
    RecyclerView recyclerView;
    ArrayList<Map<String,String>> data;
    public CustomerAdapter(MainActivity mainActivity, ArrayList<Map<String,String>> data ) {
        context = mainActivity;
        this.data = data;
    }
    @NonNull
    @Override
    public CustomerAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(context).inflate(R.layout.layout, viewGroup, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder (@NonNull CustomerAdapter.ViewHolderClass viewHolderClass,int i)
    {
        viewHolderClass.pos_name.setText(data.get(i).get("name"));
        viewHolderClass.experience.setText(data.get(i).get("exp"));
        viewHolderClass.sal_range.setText(data.get(i).get("sal1"));
        viewHolderClass.location.setText(data.get(i).get("loc"));
        viewHolderClass.key_skills.setText(data.get(i).get("skills"));
        viewHolderClass.createddate.setText(data.get(i).get("date"));

    }

    @Override
    public int getItemCount () {
        return data.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        TextView pos_name,experience,sal_range,location,key_skills,createddate;
        public ViewHolderClass(@NonNull View itemView) {

            super(itemView);
            pos_name= itemView.findViewById(R.id.name);
            experience = itemView.findViewById(R.id.exp);
            sal_range = itemView.findViewById(R.id.sal1);
            location = itemView.findViewById(R.id.loc);
            key_skills = itemView.findViewById(R.id.skills);
            createddate = itemView.findViewById(R.id.date);


        }
    }
}