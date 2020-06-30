package com.manuela.timemanager;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;
import com.manuela.timemanager.User;

public class UserRepository {
    private static UserRepository instance;
    private List<User> users = new ArrayList<>();

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void register(User user) {
        users.add(user);
    }

    private void defaultValues() {
        User camilaUser = new User("Svartala", "Camila", "camila@gmail.com", "1234");
        users.add(camilaUser);

        User camiloUser = new User("Machine", "Camilo", "camilo@gmail.com", "4321");
        users.add(camiloUser);
    }
}
