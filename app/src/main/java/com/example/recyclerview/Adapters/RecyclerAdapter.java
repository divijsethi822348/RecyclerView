package com.example.recyclerview.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview.Activities.MainActivity;
import com.example.recyclerview.Activities.Model;
import com.example.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {





    private List<Model> List;

    private Context context;

    public RecyclerAdapter(java.util.List<Model> list, Context context) {
        List = list;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        public CircleImageView pp;
        public ImageView like,options;
        public ImageView image;
        public TextView name;
        public int count=0;
        public int count2=0;
        public Button close;



        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);

            like=(ImageView)itemView.findViewById(R.id.like);
            pp=(CircleImageView)itemView.findViewById(R.id.pp);
            name=(TextView)itemView.findViewById(R.id.name);
            image=(ImageView)itemView.findViewById(R.id.image);
            options=(ImageView) itemView.findViewById(R.id.options);
            like.setOnClickListener(this);
            image.setOnLongClickListener(this);

            options.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "hey", Toast.LENGTH_SHORT).show();









                }
            });


        }

        @Override
        public void onClick(View v) {
            count++;

            if(count%2!=0) {
                like.setImageResource(R.drawable.like2);
            }
            else{
                like.setImageResource(R.drawable.like);
            }

        }

        @Override
        public boolean onLongClick(View v) {
            count2++;

            if(count2%2!=0) {
                like.setImageResource(R.drawable.like2);
            }
            else{
                like.setImageResource(R.drawable.like);
            }

            return false;
        }
    }






    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_list_row,viewGroup,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Model model=List.get(i);
        myViewHolder.pp.setImageResource(model.getPp());
        myViewHolder.name.setText(model.getName());
        myViewHolder.image.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return List.size();
    }


}


