package com.example.loadmylist.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.loadmylist.AnimalAdapter;
import com.example.loadmylist.R;
import com.example.loadmylist.Utils;

public class MainActivity extends AppCompatActivity {

    private RecyclerView zoAnimal;
    private AnimalAdapter animalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoAnimal=findViewById(R.id.rv_animals);

        // Finish setting up recyclerview
        zoAnimal.setLayoutManager(new LinearLayoutManager(this));
        zoAnimal.setHasFixedSize(true);

        // Init animals adapter
        animalAdapter = new AnimalAdapter(Utils.getAnimalsList());
        zoAnimal.setAdapter(animalAdapter);

    }

    // TODO: Step 1 -> Create "AnimalAdapter" in adapter folder, it will take a list of Animals [List<Animal>]
    // TODO: Step 2 -> Setup RecyclerView in MainActivity
    // TODO: Step 3 -> In Utils Class add information to each Animal in the method getAnimalsList()
    // TODO: Step 4 -> Load list into RecyclerView and Run Application
}
