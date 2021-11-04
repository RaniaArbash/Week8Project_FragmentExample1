package com.example.fragmentexample1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment implements View.OnClickListener {

Button button;
int id;

    FragmentTwo(int id){
        this.id = id;
    }
    public interface FragmentListener{
        public void onReturn(String value);
    }

    public FragmentListener listener;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_two,container,false);
       // int id = getArguments().getInt("imageid");
        ImageView image = (ImageView) v.findViewById(R.id.imageInFragment2);
        image.setImageResource(id);
        button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(this);
        return v;


    }

    @Override
    public void onClick(View view) {
        listener.onReturn("Value from Fragment");

    }
}
