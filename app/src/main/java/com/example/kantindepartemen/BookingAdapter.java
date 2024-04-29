package com.example.kantindepartemen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.ViewHolder> {
    private ArrayList<Table> bookingItemList;
    private Context context;

    public BookingAdapter(Context context, ArrayList<Table> bookingItemList) {
        this.context = context;
        this.bookingItemList = bookingItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.booking_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Table bookingItem = bookingItemList.get(position);
        holder.table_number.setText(String.valueOf(bookingItem.getTableNumber()));
        if (bookingItem.isBooked()) {
            holder.is_booked.setText("Booked");
            holder.itemView.setBackgroundColor(context.getResources().getColor(android.R.color.holo_red_dark));
        } else {
            holder.is_booked.setText("Available");
            holder.itemView.setBackgroundColor(context.getResources().getColor(android.R.color.darker_gray));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookDialogFragment dialogFragment = new BookDialogFragment(bookingItem, BookingAdapter.this, position);
                dialogFragment.show(((AppCompatActivity)context).getSupportFragmentManager(), "book_dialog");
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookingItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView table_number;
        TextView is_booked;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            table_number = itemView.findViewById(R.id.table_number);
            is_booked = itemView.findViewById(R.id.book_status);
        }
    }
}