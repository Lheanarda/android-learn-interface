package com.example.interfaceinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boxer boxerA;
    KickBoxer kickBoxerA;
    private Button btnThrowJab,btnThrowHarderJab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxerA = new Boxer(50) ;
        kickBoxerA = new KickBoxer() ;

        btnThrowJab = findViewById(R.id.btnThrowJab);
        btnThrowHarderJab= findViewById(R.id.btnThrowHarderJab);

        FightMethod(btnThrowJab,boxerA.throwJab());
        FightMethod(btnThrowHarderJab,kickBoxerA.throwJab());

        Log.i("mytag",boxerA.speed+"");

    }

    public void FightMethod(Button btn, final String method){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,method,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
