package com.nam.user;
import java.util.ArrayList;

public class UserService {
    UserDAO sv = new UserDAO();
    public void addUser(User user){
        sv.saveUser(user);
    }
    public ArrayList<User> getUser(){
        return sv.getUsers();
    }
}
