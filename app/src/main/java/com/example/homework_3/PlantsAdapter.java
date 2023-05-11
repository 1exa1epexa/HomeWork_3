package com.example.homework_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlantsAdapter extends RecyclerView.Adapter<PlantsAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Plants> plants; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public PlantsAdapter(Context context, List<Plants> plants) {
        this.inflater = LayoutInflater.from(context);
        this.plants = plants;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public PlantsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(PlantsAdapter.ViewHolder holder, int position) {
        Plants plant = plants.get(position);
        holder.plantView.setImageResource(plant.getPlantResource());
        holder.nameView.setText(plant.getName());
        holder.plantDescriptionView.setText(plant.getPlantDescription());

    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return plants.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView plantView;
        final TextView nameView, plantDescriptionView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            plantView = view.findViewById(R.id.imageView);
            nameView = view.findViewById(R.id.name);
            plantDescriptionView = view.findViewById(R.id.desc);

        }
    }
}
