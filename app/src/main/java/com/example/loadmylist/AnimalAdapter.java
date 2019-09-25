package com.example.loadmylist;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.loadmylist.model.Animal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    private List<Animal> animalsList;

    public AnimalAdapter(List<Animal> animalsList) {
        this.animalsList = animalsList;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_item, parent, false);

        return new
                AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal Animal = animalsList.get(position);

        String name = Animal.getName();
        holder.tvname.setText(name);

        String type = Animal.getType();
        holder.tvtype.setText(type);

        // Change Integer to a String
        int lCoun = Animal.getLegCount();
        String legCount = Integer.toString(lCoun);
        holder.tvlegCount.setText(legCount);

        Boolean birth = Animal.isAdult();
        String Birthday = Boolean.toString(birth);
        holder.tvisAdult.setText(Birthday);


        Date date = Animal.getDateOfAdoption();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
        String strDate = formatter.format(date);
        holder.tvdatOfAdoption.setText(strDate);
    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder {
        TextView tvname, tvtype, tvlegCount, tvisAdult, tvdatOfAdoption;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.tv_name);
            tvtype =itemView.findViewById(R.id.tv_type);
            tvlegCount = itemView.findViewById(R.id.tv_leg_count);
            tvisAdult = itemView.findViewById(R.id.tv_is_adult);
            tvdatOfAdoption = itemView.findViewById(R.id.tv_date_of_adoption);
        }
    }


}
