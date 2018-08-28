package com.example.yogesh.movehack;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.

 */



public class                                       HomeFragment extends Fragment{

    private TabLayout tabLayout;
    public Fragment mfragment;
    private Fragment tripFragment;
    private Fragment mapFragment;
    private FrameLayout mframeLayout;




    public HomeFragment() {

        // Required empty public constructor
    }


    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.home_tabs);




        tripFragment=new TripFragment();
        mapFragment=new MapFragment();

        //mframeLayout=(FrameLayout)getView().findViewById(R.id.home_frame);

        setFragment(mapFragment);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {





                switch(tab.getPosition()){

                    case 0:

                       setFragment(mapFragment);
                        break;

                    case 1:

                       setFragment(tripFragment);
                        break;



                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;


    }
    private void setFragment(Fragment Fragment) {

        android.support.v4.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.home_frame,Fragment);
        fragmentTransaction.commit();
    }

}
