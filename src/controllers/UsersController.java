package controllers;

import java.util.ArrayList;

import models.User;
import view.UsersView;

public class UsersController {

    private UsersView view;
    private User model;

    public UsersController() {

        view = new UsersView();

        model = new User();
    }

    public void showUsers() {

        ArrayList<User> users = model.get();

        view.tableUsers(users);
    }

    public boolean addUser(String e,
                           String p,
                           String n) {

        boolean flag = model.make(e, p, n);

        return flag;
    }
}

