package com.ashishbharam.fragments;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private boolean isFragmentDisplayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frag1 = findViewById(R.id.button1);

        frag1.setOnClickListener(v -> {
            if (!isFragmentDisplayed) {
                display();
            } else {
                closeFragment();

            }
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        });
    }

    private void closeFragment() {
        InactiveListFragment fragment = (InactiveListFragment) getSupportFragmentManager().findFragmentById(R.id.FragmentContainer);
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction
                    .setReorderingAllowed(true)
                    .remove(fragment).commit();
        }
        isFragmentDisplayed = false;

    }

    public void display() {
        //ActiveListFragment activeListFragment = ActiveListFragment.newInstance("activeList","AList");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //fragmentTransaction.add(R.id.FragmentContainer, new InactiveListFragment()).addToBackStack(null).commit();
        fragmentTransaction
                .setReorderingAllowed(true)
                .add(R.id.FragmentContainer, InactiveListFragment.class, null, "findByTag").addToBackStack("anyName").commit();
        //.replace(R.id.FragmentContainer, InactiveListFragment.class,null).commit();
        isFragmentDisplayed = true;

    }
}