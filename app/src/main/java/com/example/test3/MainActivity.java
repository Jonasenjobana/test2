package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options,menu);
        return(super.onCreateOptionsMenu(menu));
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent i=new Intent(this,SimpleContentActivity.class);
                startActivity(i);
                return(true);
            case R.id.help:
                i=new Intent(this,SimpleContentActivity.class);
                startActivity(i);
                return(true);
        }
        return(super.onOptionsItemSelected(item));
    }
}
