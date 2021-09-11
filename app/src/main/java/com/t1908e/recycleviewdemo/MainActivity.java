package com.t1908e.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Product> listProduct = new ArrayList<>();
    private RecyclerView recyclerViewProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewProduct = findViewById(R.id.recycleViewProduct);
        initData();
        ProductAdapter productAdapter = new ProductAdapter(this, listProduct);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerViewProduct.setLayoutManager(layoutManager);
        recyclerViewProduct.setAdapter(productAdapter);

    }

    private void initData() {
        listProduct.add(new Product("Product 1", "5000.000 đ", R.drawable.p1));
        listProduct.add(new Product("Product 2", "6000.000 đ", R.drawable.p2));
        listProduct.add(new Product("Product 3", "2000.000 đ", R.drawable.p3));
        listProduct.add(new Product("Product 4", "3000.000 đ", R.drawable.p4));
        listProduct.add(new Product("Product 5", "4000.000 đ", R.drawable.p5));
        listProduct.add(new Product("Product 6", "7000.000 đ", R.drawable.p6));
    }
}