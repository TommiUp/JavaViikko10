package com.example.javaviikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, ActivityAddUser.class);
        startActivity(intent);
    }
    public void switchToUserList(View view) {
        Intent intent = new Intent(this, ActivityListUser.class);
        startActivity(intent);
    }
}
