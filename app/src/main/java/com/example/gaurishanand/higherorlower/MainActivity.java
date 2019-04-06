package com.example.gaurishanand.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void generaterandomNumber()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    public void clickFunction(View view)
    {
        EditText editText=(EditText)findViewById(R.id.NumbereditText);
        int guess=Integer.parseInt(editText.getText().toString());
        if(guess>randomNumber)
        {
            Toast.makeText(this,"LOWER",Toast.LENGTH_LONG).show();
        }
        if(guess<randomNumber)
        {
            Toast.makeText(this,"HIGHER",Toast.LENGTH_LONG).show();
        }
        if(guess==randomNumber)
        {
            Toast.makeText(this,"YOU GOT IT CORRECT BUDDY! TRY AGAIN",Toast.LENGTH_LONG).show();
            generaterandomNumber();
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generaterandomNumber();
    }
}
