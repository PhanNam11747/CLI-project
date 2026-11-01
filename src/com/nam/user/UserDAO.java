package com.nam.user;

import java.util.ArrayList;

public class UserDAO {
    ArrayList<User> users = new ArrayList<>();

    public void saveUser(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "users=" + getUsers() +
                '}';
    }
}
