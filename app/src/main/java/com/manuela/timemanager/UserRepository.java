package com.manuela.timemanager;

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
}