package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Plants> plants;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_plant);
        PlantsAdapter adapter = new PlantsAdapter(this, plants);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        plants = new ArrayList<>();
        // добавление в контейнер animals объектов сущности Animal
        plants.add( new Plants("Голубика", "Голубика – плодовый кустарник из рода Вакциниум, семейства Вересковые.",
                R.drawable.golubica, "Численность средняя"));
        plants.add( new Plants("Пихта", "Пихта (abies) – вечнозеленое дерево или кустарник из семейства Сосновые.",
                R.drawable.pixta, "Численность большая"));
        plants.add( new Plants("Кислица", "Кислица – травянистое растение из семейства Кисличные.",
                R.drawable.kislitsa, "Численность большая"));
        plants.add( new Plants("Морозник", "Морозник – многолетнее травянистое растение из семейства Лютиковые.",
                R.drawable.moroznick, "Численность большая"));
        plants.add( new Plants("\n" +
                "Тростник", "Тростник – многолетнее травянистое растение из семейства Злаковые",
                R.drawable.trostnic, "Численность большая"));
    }
}
