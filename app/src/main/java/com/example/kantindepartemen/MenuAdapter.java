package com.example.kantindepartemen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder>{
    public MenuAdapter(Context context, ArrayList<Menu> menuList) {
        this.menuList = menuList;
        this.context = context;
    }

    private ArrayList<Menu> menuList;
    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        Menu menu = menuList.get(position);
        holder.menu_name.setText(String.valueOf(menu.getName()));
        holder.menu_price.setText(String.valueOf(menu.getPrice()));
        holder.menu_description.setText(String.valueOf(menu.getDescription()));
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView menu_name;
        TextView menu_price;
        TextView menu_description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            menu_name = itemView.findViewById(R.id.menu_name);
            menu_price = itemView.findViewById(R.id.menu_price);
            menu_description = itemView.findViewById(R.id.menu_description);
        }
    }
}


