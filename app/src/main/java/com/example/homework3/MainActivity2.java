package com.example.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    String Bcolor="";
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * main activity for the Android app.
         * @author: jonathan david
         * @since: 5/10/2023
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layout=findViewById(R.id.layout);

        Intent gi = getIntent();
        Bcolor = gi.getStringExtra("Bcolor");

        if (Bcolor.equals("red")) {
            layout.setBackgroundColor(Color.RED);
        } else if (Bcolor.equals("green")) {
            layout.setBackgroundColor(Color.GREEN);
        } else if (Bcolor.equals("yellow")) {
            layout.setBackgroundColor(Color.YELLOW);
        } else if (Bcolor.equals("black")) {
            layout.setBackgroundColor(Color.BLACK);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
         * The function creates the Menu Option in MainActivity2
         * @return: return true
         */
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main2,menu);
        return true;
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        /**
         * The function called when you press eny item from the Menu Option
         * @param: the function get the item that pressed
         * @return: the function should return true
         */
        String st = item.getTitle().toString();
        if (st.equals("red")) {
            layout.setBackgroundColor(Color.RED);
        } else if (st.equals("green")) {
            layout.setBackgroundColor(Color.GREEN);
        } else if (st.equals("yellow")) {
            layout.setBackgroundColor(Color.YELLOW);
        } else if (st.equals("black")) {
            layout.setBackgroundColor(Color.BLACK);
        }
        return super.onOptionsItemSelected(item);
    }

    public void btn(View view) {
        /**
         * The function start when you click the button
         * @param: The function "return" you to MainActivity
         * @return: X
         */
        Intent si = new Intent(this,MainActivity.class);
        startActivity(si);
    }
}