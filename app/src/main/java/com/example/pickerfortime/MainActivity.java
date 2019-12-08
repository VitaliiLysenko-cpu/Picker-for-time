package com.example.pickerfortime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         time = findViewById(R.id.button_time);
         time.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        showTimePicker();

    }
    protected void showTimePicker (){
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),getString(R.string.hello_world_choose_a_time));
    }

    public  void  processTimePickerResult(int hourOfDay, int minute){
        String hourString = Integer.toString(hourOfDay);
        String minuteString = Integer.toString(minute);
        String timeMessage = hourString + ":" + minuteString;
        Toast.makeText(this,getString(R.string.time) + " " + timeMessage,
                Toast.LENGTH_SHORT).show();
    }
}
