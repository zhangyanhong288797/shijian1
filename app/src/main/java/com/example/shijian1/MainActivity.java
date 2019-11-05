package com.example.shijian1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    EditText input_zhanghao;
    EditText input_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        input_zhanghao = (EditText) findViewById( R.id.input_zhanghao );
        input_password = (EditText) findViewById( R.id.input_password );
        button1 = (Button) findViewById( R.id.button1 );
        button2 = (Button) findViewById( R.id.button2 );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account=input_zhanghao.getText().toString();
                String password=input_password.getText().toString();
                if(account.equals( "admin" )&&password.equals( "123" )){
                    Toast.makeText( MainActivity.this,"成功",Toast.LENGTH_SHORT ).show();
                }
                else{
                    Toast.makeText( MainActivity.this,"失败",Toast.LENGTH_SHORT ).show();
                }
            }
            });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this,"请输入账号和密码",Toast.LENGTH_SHORT ).show();
            }
        } );

    }
}
