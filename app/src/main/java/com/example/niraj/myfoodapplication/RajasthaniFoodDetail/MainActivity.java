package com.example.niraj.myfoodapplication.RajasthaniFoodDetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.niraj.myfoodapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<RajasthaniItemDetailActivity> reasturtant1 = new ArrayList<>();

    private Adapter mAdapter;

    static {
        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Simple Dal\n" + "Rs-60");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Dal Fry\n" + "Rs-80");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Dal Makhani\n" + "Rs-120");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Dal Tadka\n" + "Rs-120");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Dal Masur\n" + "Rs-50");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Dal Mung\n" + "Rs-60");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Aloo Posto\n" + "Rs-90");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Aloo Bhaji\n" + "Rs-95");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Sukto\n" + "Rs-130");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Chechara\n" + "Rs-80");
            reasturtant1.add(heritage1);
        }

        for (int i = 0; i < 1; i++) {
            RajasthaniItemDetailActivity heritage1 = new RajasthaniItemDetailActivity(R.drawable.dal, "Karela Bhaji\n" + "Rs-90");
            reasturtant1.add(heritage1);
        }


    }

    public MainActivity(){

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        mAdapter = new MainAdapter(this, reasturtant1);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter((ListAdapter) mAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("test","clicked");
                Intent intent=new Intent(MainActivity.this,DetalMainActivity.class);
                startActivity(intent);


            }
        });

//       final CollapsingToolbarLayout collapsingToolbarLayout=(CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//       final Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
//        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appBarLayout);
//        toolbar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
//            @Override
//            public void onViewAttachedToWindow(View v) {
//
//
//
//            }
//
//            @Override
//            public void onViewDetachedFromWindow(View v) {
//
//            }
//        });
//        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            boolean isShow = false;
//            int scrollRange = -1;
//
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//               if (scrollRange == -1) {
//                   scrollRange = appBarLayout.getTotalScrollRange();
//                }
//                if (scrollRange + verticalOffset == 0) {
//                   collapsingToolbarLayout.setTitle("Gothwal Food-Good Life Good Food");
//                   isShow = true;
//                   } else if (isShow) {
//                       collapsingToolbarLayout.setTitle(" ");
//                        isShow = false;
//                   }
//               }
//        });
//
//
//    }
    }
}
