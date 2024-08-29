package com.example.lab2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_random;
    ImageView img_xucsac;
    private Random random;

    private void RollDice(){
        int SoNgauNhien = random.nextInt(6)+1;

        switch (SoNgauNhien){
            case 1:
                img_xucsac.setImageResource(R.drawable.xucsac1);
                break;

            case 2:
                img_xucsac.setImageResource(R.drawable.xucsac2);
                break;

            case 3:
                img_xucsac.setImageResource(R.drawable.xucsac3);
                break;

            case 4:
                img_xucsac.setImageResource(R.drawable.xucsac4);
                break;

            case 5:
                img_xucsac.setImageResource(R.drawable.xucsac5);
                break;

            case 6:
                img_xucsac.setImageResource(R.drawable.xucsac6);
                break;

        }

    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_random = findViewById(R.id.btn_random);
        img_xucsac = findViewById(R.id.img_xucsac);
        random = new Random();

        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RollDice();
            }
        });
    }
}