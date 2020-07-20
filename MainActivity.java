package com.ginkgosoft.tutorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private IngredientAdapter ingredientAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On initialise notre liste de données
        List<Ingredient> listeCourse = new ArrayList<>();
        listeCourse.add(new Ingredient("Oranges", "4"));
        listeCourse.add(new Ingredient("Tomates", "2"));
        listeCourse.add(new Ingredient("Raisin", "Une grappe"));
        listeCourse.add(new Ingredient("Pain", "1/2"));
        listeCourse.add(new Ingredient("Banane", "2 ou 3"));
        listeCourse.add(new Ingredient("Kiwi", "2 ou 3"));
        listeCourse.add(new Ingredient("Pates", "500g"));
        listeCourse.add(new Ingredient("Raviolis", "Une boite"));
        listeCourse.add(new Ingredient("Fraises", "500g"));
        listeCourse.add(new Ingredient("Glace", "1L"));
        listeCourse.add(new Ingredient("Pizza", "1"));
        listeCourse.add(new Ingredient("Yaourts", "6"));
        listeCourse.add(new Ingredient("Riz", "1kg"));
        listeCourse.add(new Ingredient("Haricots", "500g"));

        recyclerView = findViewById(R.id.ingredient_recyclerview);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ingredientAdapter = new IngredientAdapter(listeCourse);
        recyclerView.setAdapter(ingredientAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);


    }
}
