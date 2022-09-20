package com.example.is2011_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void camera(MenuItem Item) {
        Item.setChecked(true);

        Intent intent4=new Intent();
        intent4.setClass(this, CameraActivity.class);

        startActivity(intent4);
        finish();

        Toast toast = Toast.makeText(this, "камера открыта",Toast.LENGTH_LONG);
        toast.show();
    }

    public void video(MenuItem Item) {
        Item.setChecked(true);

        Toast toast2 = Toast.makeText(this, "видео открыто",Toast.LENGTH_LONG);
        toast2.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.shop_settings:

                item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

                Intent intent=new Intent();
                intent.setClass(this, ShopActivity.class);

                startActivity(intent);
                finish();

                return true;
            case R.id.call_settings:

                //item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
                Intent intent2=new Intent();
                intent2.setClass(this, CallActivity.class);

                startActivity(intent2);
                finish();

                return true;

            case R.id.email_settings:

                Toast toast6 = Toast.makeText(this, "почта открыта",Toast.LENGTH_LONG);
                toast6.show();
                //item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
                return true;
            case R.id.add_settings:

                //item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

                Toast toast3 = Toast.makeText(this, "Пункт был добавлен",Toast.LENGTH_LONG);
                toast3.show();
                return true;
            case R.id.copy_settings:

                //item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

                Toast toast4 = Toast.makeText(this, "Текст скпирован",Toast.LENGTH_LONG);
                toast4.show();
                return true;
            case R.id.paste_settings:

               //item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

                Toast toast5 = Toast.makeText(this, "Текст вставлен",Toast.LENGTH_LONG);
                toast5.show();
                return true;
            case R.id.help_settings:

                //item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

                Intent intent3=new Intent();
                intent3.setClass(this, HelpActivity.class);

                startActivity(intent3);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}