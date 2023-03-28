package com.example.javaviikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserStorage s = UserStorage.getInstance();
        context = this;
        Toast.makeText(context, context.getFilesDir().toString(), Toast.LENGTH_SHORT).show();
        UserStorage.getInstance().loadUsers(context);
    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, ActivityAddUser.class);
        startActivity(intent);
    }

    public void switchToUserList(View view) {
        Intent intent = new Intent(this, ActivityListUser.class);
        startActivity(intent);
    }

    public void saveUsers(View view) {
        UserStorage.getInstance().saveUsers(context);
    }

    public void loadUsers(View view) {
        UserStorage.getInstance().loadUsers(context);
    }
}
