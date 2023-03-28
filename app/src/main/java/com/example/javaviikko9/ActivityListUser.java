package com.example.javaviikko9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.Collections;

public class ActivityListUser extends AppCompatActivity {

    private UserStorage userStorage;
    private RecyclerView recyclerView;
    private UserListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);
        userStorage = userStorage.getInstance();
        recyclerView = findViewById(R.id.rvUserList);
        Collections.sort(userStorage.getUsers(), (user1, user2) -> user1.getLastName().compareTo(user2.getLastName()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserListAdapter(getApplicationContext(), userStorage.getUsers());
        recyclerView.setAdapter(adapter);
    }

    public void removeUser(User user) {
        adapter.removeUser(user);
    }
}
