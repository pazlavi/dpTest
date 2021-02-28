package com.paz.dptest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open = findViewById(R.id.open);
        open.setOnClickListener(v -> openApp());
    }

    private void openApp() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paz.onelink.me/waF3/paz"));
        browserIntent.setData(Uri.parse("https://paz.onelink.me/waF3/paz"));
        browserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
        browserIntent.putExtra("paz", "deep link test");
        startActivity(browserIntent);
    }

}