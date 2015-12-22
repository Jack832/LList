package com.example.test4.llist;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.home);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.search_id:
            Toast.makeText(MainActivity.this,"cancel",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.search_id1:
                Toast.makeText(MainActivity.this,"wifi on",Toast.LENGTH_SHORT).show();
                return true;
            default:return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN)
        {
            toggleAction();
        }
        return true;
    }
    public void  toggleAction()
    {
        ActionBar actionBar=getActionBar();
        if(actionBar !=null)
        {
            if(actionBar.isShowing())
            {
                actionBar.hide();
            }
            else {
                actionBar.show();
            }
        }
    }
}
