package companyprofileapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button4 = (Button) findViewById(R.id.button4);
        button4.setBackgroundResource(android.R.color.holo_orange_light);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });


        button3 = (Button) findViewById(R.id.button3);
        button3.setBackgroundResource(android.R.color.holo_orange_light);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });



        button2 = (Button) findViewById(R.id.button2);
        button2.setBackgroundResource(android.R.color.holo_orange_light);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });



        button = (Button) findViewById(R.id.button);
        button.setBackgroundResource(android.R.color.holo_orange_light);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


        }
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent1 = new Intent(this, activity3.class);
        startActivity(intent1);
    }
    public void openActivity4(){
        Intent intent2 = new Intent(this, Activity4.class);
        startActivity(intent2);
    }
    public void openActivity5(){
        Intent intent3 = new Intent(this, Activity5.class);
        startActivity(intent3);
    }


    public void saveNote(View view) {
    }
}
