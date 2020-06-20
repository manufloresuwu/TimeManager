/*
package com.manuela.timemanager.repository;

//import com.manuela.timemanager.model.User;

import java.util.ArrayList;
//import java.util.List;


public class UserRepository {
    private static UserRepository instance;
    //private List<User> users = new ArrayList<>();

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    private UserRepository() {
        fillDefaultValues();
    }

    public User login(String email, String password) {
        for (User user : users)
            if (user.getPassword().equals(password))
                if (user.getEmail().equals(email)) {
                    return user;
                }
        return null;
    }

    public void register(User user) {
        users.add(user);
    }

    private void fillDefaultValues() {
        users.add(new User("Administrador",
                "admin@app.com",
                "123",
                "Bolivia"));
    }
}





*/