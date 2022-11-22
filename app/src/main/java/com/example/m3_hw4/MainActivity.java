package com.example.m3_hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data_Model [] my_data = new Data_Model[]{
                new Data_Model("Мир по прежнему красив","12 серий",R.drawable.aa),
                new Data_Model("Семейка шпиона ","21 серий",R.drawable.bb),
                new Data_Model("Товоя апрельская ложь","22 серий",R.drawable.v),
                new Data_Model("Клинок рассекаюший демонов","44 серий",R.drawable.dd),
                new Data_Model("     Дитя погоды      ","1 час 52 минут",R.drawable.ee),
                new Data_Model("        Твоё имя         ","1 час 46 минут",R.drawable.ff),
                new Data_Model("Принцесса  библиофил ","12 серий",R.drawable.gg),
                new Data_Model("         Ваззрок         ","13 серий",R.drawable.hh),
                new Data_Model("   Одинокий рокер  ","12 серий",R.drawable.jj),
                new Data_Model("    Время нинзя       ","13 серий",R.drawable.kk),
                new Data_Model("  Детективы Футо   ","12 серий",R.drawable.ll),
                new Data_Model("    Наруто         ","500 серий",R.drawable.nn)
        };

        myrecycler_view = findViewById(R.id.recycler_view);
        Data_Adapter myadapter = new Data_Adapter(my_data);
        myrecycler_view.setLayoutManager(new LinearLayoutManager(this ));
        myrecycler_view.setAdapter(myadapter);
    }
}