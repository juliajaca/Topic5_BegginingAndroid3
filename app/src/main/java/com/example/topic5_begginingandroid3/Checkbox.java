package com.example.topic5_begginingandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Checkbox extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        cb=(CheckBox)findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked) {
            cb.setText("This checkbox is: checked");
        }
        else {
            cb.setText("This checkbox is: unchecked");
        }

    }
}