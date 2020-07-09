package com.example.temperaturecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    RadioButton ftoc;
    RadioButton ctof;
    TextView textView3;
    Button cal;
    Double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editText);
        ftoc = findViewById(R.id.ftoc);
        ctof = findViewById(R.id.ctof);
        textView3 = findViewById(R.id.textView3);
        cal = findViewById(R.id.button2);
        textView3.setVisibility(View.GONE);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(editText.getText().toString().isEmpty()){
                textView3.setText("Please give temprature");
            }
            else {
                x = Double.parseDouble(String.valueOf(editText.getText()));
                if (ctof.isChecked()) {
                    x = (x * 9) / 5 + 32;
                    textView3.setText(String.valueOf(x) + " Degree F");
                    }
                else if (ftoc.isChecked()) {
                    x = (x - 32) * 5 / 9;
                    textView3.setText(String.valueOf(x) + " Degree C");
                    }
                }
                textView3.setVisibility(View.VISIBLE);
            }

        });
    }
}