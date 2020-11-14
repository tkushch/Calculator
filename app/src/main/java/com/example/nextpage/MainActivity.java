package com.example.nextpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, ac, delete, percent, division, plus, minus, equal, multiplication, theme;
    private static EditText answer;
    private static String a = "", b = "", whattodo = "";
    private static Double A = 0d, B = 0d;
    private static boolean first = true;

    public static String ifint(String x){
        if (x.charAt(x.length() - 1) == "0".charAt(0) && x.charAt(x.length() - 2) == ".".charAt(0)){
            int start = 0;
            int end = x.length() - 2;
            char[] dst = new char[end - start];
            x.getChars(start, end, dst, 0);
            return String.valueOf(dst);
        }
        else{
            return x;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n0 = findViewById(R.id.n0);
        ac = findViewById(R.id.ac);
        delete = findViewById(R.id.delete);
        percent = findViewById(R.id.percent);
        division = findViewById(R.id.division);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        equal = findViewById(R.id.equal);
        multiplication = findViewById(R.id.multiplication);
        theme = findViewById(R.id.theme);
        answer = findViewById(R.id.answer);

        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        n0.setOnClickListener(this);
        ac.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        try {
            if (v == findViewById(R.id.n1)) {
                a += "1";
                if (!first) {
                    b += "1";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n2)) {
                a += "2";
                if (!first) {
                    b += "2";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n3)) {
                a += "3";
                if (!first) {
                    b += "3";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n4)) {
                a += "4";
                if (!first) {
                    b += "4";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n5)) {
                a += "5";
                if (!first) {
                    b += "5";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n6)) {
                a += "6";
                if (!first) {
                    b += "6";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n7)) {
                a += "7";
                if (!first) {
                    b += "7";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n8)) {
                a += "8";
                if (!first) {
                    b += "8";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n9)) {
                a += "9";
                if (!first) {
                    b += "9";
                }
                answer.setText(a);
            }
            if (v == findViewById(R.id.n0)) {
                a += "0";
                if (!first) {
                    b += "0";
                }
                answer.setText(a);
            }


            if (v == findViewById(R.id.plus)) {
                whattodo = "+";
                A = Double.valueOf(a);
                a += " + ";
                answer.setText(a);
                first = false;
            }

            if (v == findViewById(R.id.minus)) {
                whattodo = "-";
                A = Double.valueOf(a);
                a += " - ";
                answer.setText(a);
                first = false;
            }


            if (v == findViewById(R.id.equal)) {
                B = Double.valueOf(b);
                if (whattodo == "+") {
                    answer.setText(a + " = " + ifint(Double.toString(A + B)));
                }
                if (whattodo == "-") {
                    answer.setText(a + " = " + ifint(Double.toString(A - B)));
                }
            }
            if (v == findViewById(R.id.ac)) {
                answer.setText("");
                first = true;
                a = "";
                b = "";
                A = 0d;
                B = 0d;
                whattodo = "";

            }
        } catch (NumberFormatException e) {
            answer.setText("ERROR");
        }


    }
}