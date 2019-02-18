package com.example.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
Date selecetedDate;
    CalendarView calenderView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calenderView = (CalendarView)findViewById(R.id.datePicker);
        registerForContextMenu(calenderView);
        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {

                //setContentView(R.layout.date_event);
            }
        });
        selecetedDate =new Date(calenderView.getDate());

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.layout.context_menu, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v == calenderView)
        {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.layout.context_menu, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Log.d(tag, "Context item selected " + item.getItemId());
        switch (item.getItemId()) {
            case R.id.create1:
                Toast.makeText(getBaseContext(), "CREATE", Toast.LENGTH_LONG).show();
                return true;
            case R.id.update1:
                Toast.makeText(getBaseContext(), "UPDATE", Toast.LENGTH_LONG).show();
                return true;
            case R.id.print:
                Toast.makeText(this, "Print ....", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
