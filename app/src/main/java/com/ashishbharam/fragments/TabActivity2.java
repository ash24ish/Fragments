package com.ashishbharam.fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

// issues : recyclerview list state is not Maintained.
public class TabActivity2 extends AppCompatActivity {

    TabLayout tabLayout;
    FragmentContainerView containerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        tabLayout = findViewById(R.id.tabLayout);
        containerView = findViewById(R.id.FragmentContainer2);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (tab.getPosition()) {
                    case 0:
                        //InactiveListFragment fragment = (InactiveListFragment) getSupportFragmentManager().findFragmentById(R.id.FragmentContainer);

                        fragmentTransaction
                                .setReorderingAllowed(true)
                                .replace(R.id.FragmentContainer2, ActiveListFragment.class, null, "findByTagActive")
                                .addToBackStack("anyName").commit();
                        break;

                    case 1:
                        fragmentTransaction
                                .setReorderingAllowed(true)
                                .replace(R.id.FragmentContainer2, InactiveListFragment.class, null, "findByTagInactive")
                                .addToBackStack("anyName").commit();
                        break;
                    case 2:
                        fragmentTransaction
                                .setReorderingAllowed(true)
                                .replace(R.id.FragmentContainer2, ActiveListFragment.class, null, "findByTagActive")
                                .addToBackStack("anyName").commit();
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

    }
}