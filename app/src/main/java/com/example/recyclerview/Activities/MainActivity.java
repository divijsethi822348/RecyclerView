package com.example.recyclerview.Activities;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview.Adapters.RecyclerAdapter;
import com.example.recyclerview.Adapters.StoryAdapter;
import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Model> List = new ArrayList<>();
    private List<Model2> List2 = new ArrayList<>();
    private RecyclerView recyclerView,recyclerView2;
    private RecyclerAdapter Adapter;
    private StoryAdapter Adapter2;
    private ImageView like,messages;
    private DrawerLayout drawerLayout;
    private RelativeLayout content;
    private TextView stories,app_name;
    private  Button drawer;

    @Override
    public void onBackPressed() {
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(Gravity.START)){
            drawerLayout.closeDrawer(Gravity.START);
        }
        else{
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like=(ImageView)findViewById(R.id.like);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView2=(RecyclerView) findViewById(R.id.recycler_story);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        content=(RelativeLayout) findViewById(R.id.comment);
        stories=(TextView) findViewById(R.id.stories);
        drawer=(Button) findViewById(R.id.drawer);
        app_name=(TextView) findViewById(R.id.app_name);
        messages=(ImageView) findViewById(R.id.messages);

        drawerLayout.setScrimColor(Color.TRANSPARENT);

        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {
                recyclerView.setTranslationX((view.getWidth()*v));
                recyclerView2.setTranslationX((view.getWidth()*v));
                stories.setTranslationX(view.getWidth()*v);
                drawer.setTranslationX(view.getWidth()*v);
                app_name.setTranslationX(view.getWidth()*v);
                messages.setTranslationX(view.getWidth()*v);

            }

            @Override
            public void onDrawerOpened(@NonNull View view) {

            }

            @Override
            public void onDrawerClosed(@NonNull View view) {

            }

            @Override
            public void onDrawerStateChanged(int i) {

            }
        });

        recyclerView.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(mLayoutManager);

        RecyclerView.LayoutManager sLayoutManager= new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(sLayoutManager);

        Model model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);

        model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);

        model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);

        model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);
        model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);

        model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);

        model=new Model(R.drawable.pp1, R.drawable.image1,"Jenifer");
        List.add(model);

        model=new Model(R.drawable.pp2, R.drawable.image2,"Shaman");
        List.add(model);






       for(int i=1;i<11;i++){

           Model2 model2=new Model2(R.drawable.pic,"Your Story");
           List2.add(model2);
       }






        Adapter=new RecyclerAdapter(List,this);

        recyclerView.setAdapter(Adapter);


        Adapter2=new StoryAdapter(List2);
        recyclerView2.setAdapter(Adapter2);



    }

    public  void drawer(View v){
        drawerLayout.openDrawer(Gravity.START);

    }


}
