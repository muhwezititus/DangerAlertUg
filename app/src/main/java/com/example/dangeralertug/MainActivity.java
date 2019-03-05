package com.example.dangeralertug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // MUHWEZI TITUSS RUTEMBESA
    // 2017/BIT/099/PS

    private EditText UserName;
    private EditText Password;
    private Button Login;
    private TextView Notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText) findViewById(R.id.etUserName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        Notice = (TextView) findViewById(R.id.etNotice);

        Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                valid(UserName.getText().toString(), Password.getText().toString());

            }
        });

    }
    private void valid(String Name, String UserPassword){

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);

    }
}
