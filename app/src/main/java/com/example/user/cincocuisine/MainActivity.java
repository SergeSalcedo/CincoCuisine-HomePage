package com.example.user.cincocuisine;

import android.app.Dialog;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appBarLayout ;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        tablayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager =(ViewPager) findViewById(R.id.viewpager_id);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        //Adding Fragments
        adapter.AddFragment(new Account(),"Account");
        adapter.AddFragment(new Recipes(),"Recipes");
        adapter.AddFragment(new Timers(),"Timers");
        adapter.AddFragment(new Settings(),"Settings");
        //Adapter Setup
        tablayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
    }
}
