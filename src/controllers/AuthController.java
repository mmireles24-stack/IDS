package controllers;

import models.AuthModel;
import view.AuthView;

public class AuthController {

    private AuthView vista;
    private AuthModel modelo;

    public AuthController() {
        vista = new AuthView();
        modelo = new AuthModel();
    }

    public void showLogin() {
        vista.loginView(this);
    }

    public boolean login(String user, String pass) {
        return modelo.login(user, pass);
    }
}