package com.example.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn;
    String color="";
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * main activity for the Android app.
         * @author: jonathan david
         * @since: 5/10/2023
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.ll);
        btn=findViewById(R.id.btn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
         * The function creates the Menu Option in MainActivity
         * @return: return true
         */
        MenuInflater  inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        /**
         * The function starts when you click a item in OptionMenu
         * @param: the function get the item that pressed
         * @return: the function should return true
         */
        String st = item.getTitle().toString();
        if (st.equals("red")) {
            layout.setBackgroundColor(Color.RED);
            color="red";
        } else if (st.equals("green")) {
            layout.setBackgroundColor(Color.GREEN);
            color="green";
        } else if (st.equals("yellow")) {
            layout.setBackgroundColor(Color.YELLOW);
            color="yellow";
        }
        return super.onOptionsItemSelected(item);
    }

    public void btn(View view) {
        /**
         * The function start when you click the button
         * @param: The function "goes" to MainActivity
         * @return: X
         */
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("Bcolor",color);
        startActivity(si);
    }
}