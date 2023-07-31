package com.example.tutorial6;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EnterPage extends AppCompatActivity {
    String userWeight = "";
    String userHeight = "";
    String userCaloriesTarget = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_activity);

        Button weekly = findViewById(R.id.weekly);
        Button buttonStartPractice = findViewById(R.id.startsession);

        EditText editTextUserWeight = findViewById(R.id.weightEditText);
        TextWatcher textWatcherUserWeight = new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                userWeight = editTextUserWeight.getText().toString();
                Log.d("Debug", "userWeight = " + userWeight); }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {    }
            @Override
            public void afterTextChanged(Editable s) {  } };
        editTextUserWeight.addTextChangedListener(textWatcherUserWeight);
        EditText editTextUserHeight = findViewById(R.id.heightEditText);
        TextWatcher textWatcherUserHeight = new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                userHeight = editTextUserHeight.getText().toString();
                Log.d("Debug", "userHeight = " + userHeight); }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {    }
            @Override
            public void afterTextChanged(Editable s) {  } };
        editTextUserHeight.addTextChangedListener(textWatcherUserHeight);
        EditText editTextUserCaloriesTarget = findViewById(R.id.goalEditText);
        TextWatcher textWatcherUserCaloriesTarget = new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                userCaloriesTarget = editTextUserCaloriesTarget.getText().toString();
                Log.d("Debug", "userCaloriesTarget = " + userCaloriesTarget); }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {    }
            @Override
            public void afterTextChanged(Editable s) {  } };
        editTextUserCaloriesTarget.addTextChangedListener(textWatcherUserCaloriesTarget);

        buttonStartPractice.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { ClickStartSession(); } });
        weekly.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { ClickWeeklyProgress(); } });


    }
    private void ClickStartSession() {
        Intent intent = new Intent(this, Progress.class);
        intent.putExtra("userSettings", userHeight + ", " + userWeight + ", " + userCaloriesTarget);
        Log.d("Debug", "data sent");
        startActivity(intent); }

    private void ClickWeeklyProgress() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); }


}
