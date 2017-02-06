package com.example.jay.context_menu_options;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button cntxtbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cntxtbtn =(Button) findViewById(R.id.btn);
        //register the cntxtbtn from activity_main.xml file to context menu
        registerForContextMenu(cntxtbtn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select the Action");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.comp:
                //select item computer with id comp from menu.xml file and toast
                Toast.makeText(MainActivity.this, "Computer is Selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.game:
                //select item gamepad with id game from menu.xml file and toast
                Toast.makeText(MainActivity.this, "Gamepad is Selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.lap:
                //select item laptop with id lap from menu.xml file and toast
                Toast.makeText(MainActivity.this, "Laptop is Selected", Toast.LENGTH_SHORT).show();

                return true;

            default: return super.onContextItemSelected(item);
        }
    }



}
