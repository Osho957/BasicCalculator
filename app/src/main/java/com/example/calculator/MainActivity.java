package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

      EditText num1, num2;
      TextView result;
      Button add ,sub, product, divison;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editNum1);
        num2 = findViewById(R.id.editNum2);


        result = findViewById(R.id.txtView);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        product =findViewById(R.id.btnMultiply);
        divison = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstValue,secondValue,ans;
                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue + secondValue;

                result.setText("Ans is = "+ans);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstValue,secondValue,ans;
                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue - secondValue;

                result.setText("Ans is = "+ans);

            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstValue,secondValue,ans;
                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue * secondValue;

                result.setText("Ans is = "+ans);

            }
        });
        divison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstValue,secondValue,ans;
                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans = firstValue / secondValue;

                result.setText("Ans is = "+ans);

            }
        });
    }
}