package com.example.recyclerview.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.Activities.Model2;
import com.example.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

    private List<Model2> List2;

    public StoryAdapter(List<Model2> List2) {
        this.List2=List2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.stories_child,viewGroup,false);

        return new StoryAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Model2 model2=List2.get(i);
        myViewHolder.story.setImageResource(model2.getStory());
        myViewHolder.snm.setText(model2.getSnm());

    }

    @Override
    public int getItemCount() {
        return List2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public CircleImageView story;
        public TextView snm;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            story=(CircleImageView)itemView.findViewById(R.id.story);
            snm=(TextView)itemView.findViewById(R.id.snm);
        }
    }
}
