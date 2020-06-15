package com.example.padtm_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "Metoda onCreate");

        Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lab2", "Metoda onResume");

        Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Lab2", "Metoda onPause, Activity zostało przykryte");

        Toast.makeText(this, "Metoda onPause, Activity zostało przykryte", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lab2", "Metoda onStop, Activity zostało wstrzymane");

        Toast.makeText(this, "Metoda onStop, Activity zostało wstrzymane", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lab2", "Metoda onRestart, Activity zostało przywrócone po wstrzymaniu");

        Toast.makeText(this, "Metoda onRestart, Activity zostało przywrócone po wstrzymaniu", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lab2", "Metoda onDestroy, Activity zostało zamknięte");

        Toast.makeText(this, "Metoda onPause, Activity zostało zamknięte", Toast.LENGTH_SHORT).show();


    }
}