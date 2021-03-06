package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");
        Log.d(TAG, "onCreate: Test Git");


        Log.d(TAG, "onCreate: Test Git");

        Log.d(TAG, "onCreate: Test Git");

        Log.d(TAG, "onCreate: Test Git");

        for (int i = 0; i < 20; i++) {
            Log.d(TAG, "onCreate: Test Git :" + i);
        }


        for (int i = 0; i < 20; i++) {
            Log.d(TAG, "onCreate: Test Git :" + i);
        }

        for (int i = 0; i < 20; i++) {
            Log.d(TAG, "onCreate: Test Git :" + i);
        }

    }
}