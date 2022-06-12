package com.example.buttonpresscounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;
    int counter, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.Counter_View);
        btn = (Button) findViewById(R.id.btn);
        counter = 0;
        time = 30;

        btn.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick (View v){

                    //CountDownTimer.start();
                    counter ++;
                    txt.setText(String.valueOf(counter));

                }
        });
    }
}