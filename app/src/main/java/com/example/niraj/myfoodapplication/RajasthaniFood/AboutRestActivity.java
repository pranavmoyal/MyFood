package com.example.niraj.myfoodapplication.RajasthaniFood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.niraj.myfoodapplication.R;
import com.example.niraj.myfoodapplication.RajasthaniFoodDetail.FoodActivity;

import java.util.ArrayList;
import java.util.List;

public class AboutRestActivity extends AppCompatActivity {
    private static List<RestaurtentActivity> reasturtant = new ArrayList<>();

    private Adapter mAdapter;


    static {
        for (int i = 0; i < 1; i++) {
            RestaurtentActivity heritage1 = new RestaurtentActivity(R.drawable.raj,"Rajasthani Food");
            reasturtant.add(heritage1);
        }
        for (int j = 0; j < 1; j++) {
            RestaurtentActivity heritage = new RestaurtentActivity(R.drawable.punjabi, "Punjabi Food");
            reasturtant.add(heritage);
        }
        for (int k = 0; k < 1; k++){
            RestaurtentActivity heritage2 = new RestaurtentActivity(R.drawable.gujrati, "Gujarati Food");
            reasturtant.add(heritage2);
        }

        for (int k = 0; k < 1; k++){
            RestaurtentActivity heritage2 = new RestaurtentActivity(R.drawable.si, "South Indian Food");
            reasturtant.add(heritage2);
        }

        for (int k = 0; k < 1; k++){
            RestaurtentActivity heritage2 = new RestaurtentActivity(R.drawable.bangali, "Bengali Food");
            reasturtant.add(heritage2);
        }

    }

    public AboutRestActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        mAdapter = new RestaurtentAdapter(this, reasturtant);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter((ListAdapter) mAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("test","clicked");
                Intent intent=new Intent(AboutRestActivity.this,FoodActivity.class);
                startActivity(intent);


            }
        });



//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//      toolbar.setTitle("pranav moyal");
//       setSupportActionBar(toolbar);
    //     getSupportActionBar().setDisplayShowHomeEnabled(true);

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

//        switch(item.getItemId()){
//            case R.id.phone:
//                Toast.makeText(getBaseContext(), "You selected Phone", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.computer:
//                Toast.makeText(getBaseContext(), "You selected Computer", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.gamepad:
//                Toast.makeText(getBaseContext(), "You selected Gamepad", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.camera:
//                Toast.makeText(getBaseContext(), "You selected Camera", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.video:
//                Toast.makeText(getBaseContext(), "You selected Video", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.email:
//                Toast.makeText(getBaseContext(), "You selected EMail", Toast.LENGTH_SHORT).show();
//                break;
//
////            case R.id.aboutfood:
////                Toast.makeText(getBaseContext(), "You selected About Food", Toast.LENGTH_SHORT).show();
////                break;
//
////            case R.id.help:
////                Toast.makeText(getBaseContext(), "You selected Help", Toast.LENGTH_SHORT).show();
////                break;
////
////            case R.id.exit:
////                Toast.makeText(getBaseContext(), "You selected Exit", Toast.LENGTH_SHORT).show();
////                break;
//
//        }
        return true;

    }
//        int id = item.getItemId();
//
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


    }

