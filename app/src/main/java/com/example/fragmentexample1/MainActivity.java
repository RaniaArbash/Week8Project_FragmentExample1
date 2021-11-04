package com.example.fragmentexample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();

    }

    public void AddFragmentTwo(View view) {
        Bundle bundle1 = new Bundle();
        bundle1.putInt("imageid",R.drawable.img);
        fm.beginTransaction().add(R.id.fragment_container_view,FragmentTwo.class,bundle1).commit();
    }
}