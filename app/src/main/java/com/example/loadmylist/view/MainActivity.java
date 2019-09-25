package com.example.loadmylist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.loadmylist.R;
import com.example.loadmylist.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TODO: Step 1 -> Create "AnimalAdapter" in adapter folder, it will take a list of Animals [List<Animal>]
    // TODO: Step 2 -> Setup RecyclerView in MainActivity
    // TODO: Step 3 -> In Utils Class add information to each Animal in the method getAnimalsList()
    // TODO: Step 4 -> Load list into RecyclerView and Run Application
}
