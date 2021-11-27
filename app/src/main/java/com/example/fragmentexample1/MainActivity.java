package com.example.fragmentexample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements FragmentTwo.FragmentListener {
    FragmentManager fm;
    FragmentTwo fragmentTwo;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        fm = getSupportFragmentManager();
    }
    public void AddFragmentTwo(View view) {
         fragmentTwo = new FragmentTwo(R.drawable.img);
        fragmentTwo.listener = this;
        fm.beginTransaction().add(R.id.fragment_container_view,fragmentTwo,"tag").commit();
    }
    @Override
    public void onReturn(String value) {
        text.setText(value);
        getSupportFragmentManager().beginTransaction().remove(fragmentTwo).commit();
    }
}