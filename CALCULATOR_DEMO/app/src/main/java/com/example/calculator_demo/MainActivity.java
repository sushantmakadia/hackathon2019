package com.example.calculator_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,equal,clear,add,sub,mul,div,dot;
    EditText editText;
    float m1,m2;
    int c=0;
    boolean addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        equal=(Button)findViewById(R.id.equal);
        clear=(Button)findViewById(R.id.clear);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        dot=(Button)findViewById(R.id.dot);
        //  FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        editText=(EditText) findViewById(R.id.e1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null)
                {
                    editText.setText("");
                }
                else {
                    if(c==1){
                        m2=Float.parseFloat(editText.getText()+"");
                        if (addition==true)
                            editText.setText(m1+m2+"");
                        else if (subtraction==true)
                            editText.setText(m1-m2+"");
                        else if (multiplication==true)
                            editText.setText(m1*m2+"");
                        else if (division==true)
                            editText.setText(m1/m2+"");
                        addition=false;
                        subtraction=false;
                        division=false;
                        multiplication=false;

                    }

                    m1=Float.parseFloat(editText.getText()+"");
                    addition=true;
                    editText.setText(null);
                    c=1;
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else { if(c==1){
                    m2=Float.parseFloat(editText.getText()+"");
                    if (addition==true)
                        editText.setText(m1+m2+"");
                    else if (subtraction==true)
                        editText.setText(m1-m2+"");
                    else if (multiplication==true)
                        editText.setText(m1*m2+"");
                    else if (division==true)
                        editText.setText(m1/m2+"");
                    addition=false;
                    subtraction=false;
                    division=false;
                    multiplication=false;

                }
                    m1=Float.parseFloat(editText.getText()+"");
                    subtraction=true;
                    editText.setText(null);
                    c=1;
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null)
                {
                    editText.setText("");
                }
                else { if(c==1){
                    m2=Float.parseFloat(editText.getText()+"");
                    if (addition==true)
                        editText.setText(m1+m2+"");
                    else if (subtraction==true)
                        editText.setText(m1-m2+"");
                    else if (multiplication==true)
                        editText.setText(m1*m2+"");
                    else if (division==true)
                        editText.setText(m1/m2+"");
                    addition=false;
                    subtraction=false;
                    division=false;
                    multiplication=false;

                }
                    m1=Float.parseFloat(editText.getText()+"");
                    multiplication=true;
                    editText.setText(null);
                    c=1;
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null)
                {
                    editText.setText("");
                }
                else { if(c==1){
                    m2=Float.parseFloat(editText.getText()+"");
                    if (addition==true)
                        editText.setText(m1+m2+"");
                    else if (subtraction==true)
                        editText.setText(m1-m2+"");
                    else if (multiplication==true)
                        editText.setText(m1*m2+"");
                    else if (division==true)
                        editText.setText(m1/m2+"");
                    addition=false;
                    subtraction=false;
                    division=false;
                    multiplication=false;

                }
                    m1=Float.parseFloat(editText.getText()+"");
                    division=true;
                    editText.setText(null);
                    c=1;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2=Float.parseFloat(editText.getText()+"");
                if (addition==true){
                    editText.setText(m1+m2+"");
                    addition=false;
                }
                if (subtraction==true){
                    editText.setText(m1-m2+"");
                    subtraction=false;
                }
                if (multiplication==true)
                {
                    editText.setText(m1*m2+"");
                    multiplication=false;
                }
                if(division==true){
                    editText.setText(m1/m2+"");
                    division=false;
                }
            }
        });
    }
}
