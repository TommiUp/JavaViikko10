package com.example.javaviikko9;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static UserStorage instance = null;
    private ArrayList<User> users;

    private UserStorage() {
        users = new ArrayList<>();
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }
    public ArrayList<User> getUsers() {
        return users;
    }
    public void addUser(User user) {
        users.add(user);
    }
}
