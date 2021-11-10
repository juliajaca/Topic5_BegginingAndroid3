package com.example.topic5_begginingandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verCheckBox(View view) {
        Intent intent = new Intent(this, Checkbox.class);
        startActivity(intent);
    }

    public void verRadioButton(View view) {
        Intent intent = new Intent(this, RadioButton.class);
        startActivity(intent);
    }

    public void verWeights(View view) {
        Intent intent = new Intent(this, Weights.class);
        startActivity(intent);
    }

    public void verForm(View view) {
        Intent intent = new Intent(this, Form.class);
        startActivity(intent);
    }

    public void verOverlap(View view) {
        Intent intent = new Intent(this, Overlap.class);
        startActivity(intent);
    }

    public void verFormTable(View view) {
        Intent intent = new Intent(this, TableLayout_Form.class);
        startActivity(intent);
    }

    public void verScrollView(View view) {
        Intent intent = new Intent(this, ScrollView.class);
        startActivity(intent);
    }

    public void verField(View view) {
        Intent intent = new Intent(this, Field.class);
        startActivity(intent);
    }

    public void verImagen(View view) {
        Intent intent = new Intent(this, Image.class);
        startActivity(intent);
    }
}