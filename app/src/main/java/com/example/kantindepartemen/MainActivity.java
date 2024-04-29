package com.example.kantindepartemen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bookingbutton = findViewById(R.id.booking_button);
        ImageView menuhbutton = findViewById(R.id.menu_button);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kantine Departemen");

        FragmentManager fragmentManager = getSupportFragmentManager();
        BookingFragment homeFragment = new BookingFragment();
        Fragment fragment = fragmentManager.findFragmentByTag(BookingFragment.class.getSimpleName());
        if (!(fragment instanceof BookingFragment)) {
            fragmentManager.beginTransaction()
                    .add(R.id.fragmentContainerView, homeFragment, BookingFragment.class.getSimpleName())
                    .commit();
        }

        bookingbutton.setOnClickListener(v -> {
            Fragment fragment1 = fragmentManager.findFragmentByTag(BookingFragment.class.getSimpleName());
            if (!(fragment1 instanceof BookingFragment)) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, homeFragment, BookingFragment.class.getSimpleName())
                        .commit();
            }
        });

        menuhbutton.setOnClickListener(v -> {
            Fragment postFragment = new MenuFragment();
            Fragment fragment2 = fragmentManager.findFragmentByTag(MenuFragment.class.getSimpleName());
            if (!(fragment2 instanceof MenuFragment)) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, postFragment, MenuFragment.class.getSimpleName())
                        .commit();
            }
        });
    }
}
