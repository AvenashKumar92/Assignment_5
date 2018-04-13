package com.example.avenash_2.resume;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    // Need to use the requirements of the objects for FragmentManager and FragmentTransaction;
    FragmentManager fmanager;
    FragmentTransaction tx;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String tabHome=getResources().getString(R.string.tabHome);
        final String tabWorkExperience=getResources().getString(R.string.tabWorkExperience);
        final String tabAboutMe=getResources().getString(R.string.tabAboutMe);
        final String tabContact=getResources().getString(R.string.tabContact);

        // assign and get the object for the FragmentManager by using the below statements
        fmanager = getFragmentManager();
        //get the object for FragmentTransaction and Initialize the transaction
        tx = fmanager.beginTransaction();
        /* by default we are going to show the HomeFragment in onCreate() method using add() method
         * add() method accepts two parameters -
         * 1. id of fragment 2.object of Fragment class*/
        tx.add(R.id.frame1,new HomeFragment());
        // Commit the fragment transaction
        tx.commit();

    }

    public void displayHome(View v){
       tx = fmanager.beginTransaction();
       // when the user selects the Home button, we are replacing the HomeFragment
       tx.replace(R.id.frame1,new HomeFragment());
       tx.commit();
   }

    public void displayAboutUs(View v){
        tx = fmanager.beginTransaction();
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1,new AboutMeFragment());
        tx.commit();
    }

    public void displayContactUs(View v){
        tx = fmanager.beginTransaction();
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1,new ContactusFragment());
        tx.commit();
    }

    public void displayExperience(View v){
        tx = fmanager.beginTransaction();
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1,new WorkExperienceFragment());
        tx.commit();
    }


}
