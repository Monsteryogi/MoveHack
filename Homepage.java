package com.example.yogesh.movehack;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Homepage extends AppCompatActivity {

    private BottomNavigationView mMainnav;
    private FrameLayout mFramelayout;

    private HomeFragment homefragment;
    private NotificationFragment notifyfragment;
    private AccountFragment accountfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // initializing Bottom NavigationBar and frame layout
        mMainnav=(BottomNavigationView)findViewById(R.id.main_nav);
        mFramelayout=(FrameLayout)findViewById(R.id.main_frame);

        //constructer for Fragment
        homefragment=new HomeFragment();
        notifyfragment=new NotificationFragment();
        accountfragment=new AccountFragment();

        setFragment(homefragment);
        mMainnav.setItemBackgroundResource(R.color.colorBackground);

        mMainnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){

                    case R.id.nav_home:

                        setFragment(homefragment);
                        return true;

                    case R.id.nav_notify:

                        setFragment(notifyfragment);
                        return true;


                    case R.id.nav_account:

                        setFragment(accountfragment);
                        return true;

                    default:
                        return false;



                }
            }
        });
    }

    private void setFragment(android.support.v4.app.Fragment fragment) {

        android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }


}
