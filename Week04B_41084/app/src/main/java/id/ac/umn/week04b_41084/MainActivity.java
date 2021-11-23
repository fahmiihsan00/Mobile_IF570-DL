package id.ac.umn.week04b_41084;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_change_1;
    Button button_change_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_change_1 = findViewById(R.id.main_button_change_1);
        button_change_2 = findViewById(R.id.main_button_change_2);

        button_change_1.setOnClickListener(v ->{
                Intent intentSatu = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentSatu);

        });

        button_change_2.setOnClickListener(v ->{
                Intent intentDua = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intentDua);

        });

    }
}