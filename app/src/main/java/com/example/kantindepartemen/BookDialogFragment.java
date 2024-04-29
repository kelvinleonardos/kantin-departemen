package com.example.kantindepartemen;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class BookDialogFragment extends DialogFragment {

    public BookDialogFragment(Table table, BookingAdapter bookingAdapter, int position) {
        this.table = table;
        this.bookingAdapter = bookingAdapter;
        this.position = position;
    }

    Table table;
    BookingAdapter bookingAdapter;
    int position;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Konfirmasi")
                .setMessage("Apakah Anda yakin ingin mereservasi meja ini?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        table.setBooked(true);
                        bookingAdapter.notifyItemChanged(position);
                        dismiss();
                    }
                })
                .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                });
        return builder.create();
    }


}
