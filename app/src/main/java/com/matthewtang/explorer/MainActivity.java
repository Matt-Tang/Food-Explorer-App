package com.matthewtang.explorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,MapsActivity.class));
                }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToGoogleMaps (View view) {

        int id = view.getId();
        switch (id){
            case R.id.Food_McDonalds:
                Toast.makeText(this,"McDonalds",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
            case R.id.Food_KoreanFood:
                Toast.makeText(this,"Korean Food",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
            case R.id.Food_JapaneseFood:
                Toast.makeText(this,"Japanese Food",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
            case R.id.Drink_BubbleTea:
                Toast.makeText(this,"Bubble Tea",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
            case R.id.Drink_Starbucks:
                Toast.makeText(this,"Starbucks",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
            case R.id.Drink_TimHortons:
                Toast.makeText(this,"Tim Hortons",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
        }
    }
}
