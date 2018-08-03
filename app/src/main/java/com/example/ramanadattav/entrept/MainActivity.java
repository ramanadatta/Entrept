package com.example.ramanadattav.entrept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public Button about;
    Button login;
    Button sign;

    EditText e1,e2;

    DatabaseHelper db;



public void init()

{
    about=(Button)findViewById(R.id.button6);
    about.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent toy=new Intent(MainActivity.this,Main2Activity.class);

            startActivity(toy);
        }
    });

    login=(Button)findViewById(R.id.button);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent toy=new Intent(MainActivity.this,Main5Activity.class);
            startActivity(toy);
        }
    });

    sign=(Button)findViewById(R.id.button2);
    sign.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent toy=new Intent(MainActivity.this,Main4Activity.class);

            startActivity(toy);
        }
    });

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        db= new DatabaseHelper(this);

        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.pass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();


                login=(Button)findViewById(R.id.button);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent toy=new Intent(MainActivity.this,Main5Activity.class);
                        startActivity(toy);
                    }
                });


                if(s1.equals("")||s2.equals("")) {
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}




