package com.t1908e.recycleviewdemo;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter {
    private Activity activity;
    private List<Product> listProduct;

    public ProductAdapter(Activity activity, List<Product> listProduct) {
        this.activity = activity;
        this.listProduct = listProduct;
    }

    public ProductAdapter() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.product_item, parent, false);
        ProductHolder productHolder = new ProductHolder(itemView);
        return productHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductHolder productHolder = (ProductHolder) holder;
        Product currentProduct = listProduct.get(position);
        productHolder.textViewProductName.setText(currentProduct.getName());
        productHolder.textViewProductPrice.setText(currentProduct.getPrice());
        productHolder.imageViewCover.setImageResource(currentProduct.getImage());
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        ImageView imageViewCover;
        TextView textViewProductName;
        TextView textViewProductPrice;
        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCover = itemView.findViewById(R.id.imageCover);
            textViewProductName = itemView.findViewById(R.id.txtProductName);
            textViewProductPrice = itemView.findViewById(R.id.txtPrice);
        }
    }
}
