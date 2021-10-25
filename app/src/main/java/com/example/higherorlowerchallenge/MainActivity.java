package com.example.higherorlowerchallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void newCat (View view) {
        ImageView image = (ImageView) findViewById (R.id.catImageView);
        image.setImageResource((R.drawabel.cat2));
        Log.i("Text", "Button Clicked")
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.netlnt(20) +1;
    }
}