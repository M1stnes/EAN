package com.example.fraday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*

   1) добавить компоненты
   2) присвоили идентификаторы и привязки сделали
   3) создать переменные
   4) связать между собой переменные которые создали и Айди компонентов в методе onCreate
   5)

    */
    /*
    1 способ - прописать метод OnClick для каждой кнопки
    2 способ - прописать метод OnClickListener

    2.1 добавить компоненты
    2.2
    2.3
    2.4
    2.5
     */


    Button btnCan;
    TextView tvText;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.btnOK);
        tvText = findViewById(R.id.tvOut);
        btnCan = findViewById(R.id.btnCancel);

        //btnOk.setOnClickListener(oclBtnOK);
        //btnCan.setOnClickListener(oclBtnCan);

    }

    public void ClickOut(View v) {
        tvText.setText("Нажата кнопка ОК");
    }

    public void ClickCancel(View v) {
        tvText.setText("Нажата кнопка Cancel");
    }


    //У кнопки есть метод setOnClickListener (View.OnClickListener l).
    //нА вход подается объект с интерфейсом View.OnClickListener.
/*
    View.OnClickListener oclBtnOK = new View.OnClickListener() {
        @Override
                public void onClick(View view) {
            tvText.setText("Нажата кнопка ОК по второму методу");
        }
    };

    View.OnClickListener oclBtnCan = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvText.setText("Нажата кнопка Cancel по второму методу");
        }
    };
    
 */
}