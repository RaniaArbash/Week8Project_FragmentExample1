package com.example.fragmentexample1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_two,container,false);
        int id = getArguments().getInt("imageid");
        ImageView image = (ImageView) v.findViewById(R.id.imageInFragment2);
        image.setImageResource(id);
        return v;


    }
}
