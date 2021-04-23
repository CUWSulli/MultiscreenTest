package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.lang.Math;

public class MainActivity extends AppCompatActivity
{
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = 0;
    }

    public void onNextScreenButtonClicked(View v)
    {
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
        MySingleton.counter++;
        this.startActivity(i);
    }
    public void findFactorial(int num)
    {
        for (i = num; i <= num; i++)
        {
            int factorialnum = factorialnum * i;
        }
    }
    public void findSquareRoot(int num2)
    {
         int sqrRoot = (int) Math.sqrt(num2);
    }
}