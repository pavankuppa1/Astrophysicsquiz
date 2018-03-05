package com.example.android.quiz1app;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by kmurali on 04-03-2018.
 */

public class Main2 extends MainActivity {
                 int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    count=count+1;
                    break;
            case R.id.radioButton2:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radioButton3:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton4:
                if (checked)
                    count=count+1;
                break;
            case R.id.radioButton5:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton6:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton7:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton8:
                if (checked)
                    count=count+1;
                break;
            case R.id.radioButton9:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton10:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton11:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton12:
                if (checked)
                    count=count+1;
                break;
        }
    }
    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton13:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton14:
                if (checked)
                    count=count+1;
                break;
            case R.id.radioButton15:
                if (checked)
                    Toast.makeText(getApplicationContext(),"wrong!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void submit(View view){
        Toast.makeText(getApplicationContext(),"You answered "+count+"/5 correctly",Toast.LENGTH_SHORT).show();
    }
}
