package com.manuela.timemanager;

public class User {
    private String nickname;
    private String name;
    private String email;
    private String password;
    private String age;
    private String gender;

    public User(String nickname, String name, String email, String password, String age, String gender) {
        this.nickname = nickname;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    public String getNickname(){return nickname;}

    public void setNickname(String nickname){this.nickname = nickname;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender(){return gender;}

    public void setGender(String gender){this.gender = gender;}
}
