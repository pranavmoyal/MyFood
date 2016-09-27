package com.example.niraj.myfoodapplication.RajasthaniFoodDetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.niraj.myfoodapplication.R;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {

    private static List<FoodDetailActivity> reasturtant = new ArrayList<>();

    private Adapter mAdapter;
    String Vegitable;

    static {
        for (int i = 0; i < 1; i++) {
            FoodDetailActivity heritage1 = new FoodDetailActivity("VEGITABLES");
            reasturtant.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            FoodDetailActivity heritage1 = new FoodDetailActivity("ROTI");
            reasturtant.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            FoodDetailActivity heritage1 = new FoodDetailActivity("SWEETS");
            reasturtant.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            FoodDetailActivity heritage1 = new FoodDetailActivity("DESSERTS");
            reasturtant.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            FoodDetailActivity heritage1 = new FoodDetailActivity("VEGITABLES");
            reasturtant.add(heritage1);
        }
    }
    public FoodActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        mAdapter = new ListAdapter(this, reasturtant);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter((android.widget.ListAdapter) mAdapter);
        list.setOnItemClickListener (new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("test","clicked");

                Intent intent=new Intent(FoodActivity.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
