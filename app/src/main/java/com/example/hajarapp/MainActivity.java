package com.example.hajarapp;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {


    private int cnt = 0;


    private TextView textCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textCount = findViewById(R.id.compteur);
        Button buttonToast = findViewById(R.id.pre_bouton);
        Button buttonCount = findViewById(R.id.deu_bouton);



        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Salut Hajar", Toast.LENGTH_SHORT).show();
        });


        buttonCount.setOnClickListener(v -> {
            cnt++;
            textCount.setText(String.valueOf(cnt));
        });
    }



    public int getCnt() {
        return cnt;
    }



    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}