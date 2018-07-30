package com.example.bit_user.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCal;
    // 1. 위젯을 정의한다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // res.layout.activity_main.xml을 불러온다.
        setContentView(R.layout.activity_main);

        // 2. 정의된 위젯변수에 xml의 위젯 ID를 가져와서 담아준다.
        btnCal = (Button)findViewById(R.id.btnCal);

        // 3. 변수(위젯)을 리스너에 달아준다.
        btnCal.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btnCal:
                Intent intent = new Intent(this,CalculatorActivity.class);
                startActivity(intent);
                break;
        }
    }
}
