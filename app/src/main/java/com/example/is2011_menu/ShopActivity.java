package com.example.is2011_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;


import android.os.Bundle;

import android.widget.ListView;


public class ShopActivity extends AppCompatActivity {

    // набор данных, которые свяжем со списком
    String[] countries = { "Молоко", "Спагетти", "Хлеб", "Яблоко", "Пепси"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_layout);

        // получаем элемент ListView
        ListView countriesList = findViewById(R.id.countriesList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);

    }

    public void main(View view) {
        Intent intent=new Intent();
        intent.setClass(this, MainActivity.class);

        startActivity(intent);
        finish();
    }
}
