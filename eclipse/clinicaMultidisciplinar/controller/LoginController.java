package lojaIFPR.controller;


import java.sql.SQLException;

import lojaIFPR.dao.UsuarioDAO;
import lojaIFPR.dao.ExceptionDAO;

public class LoginController {
    private UsuarioDAO usuarioDAO;

    public LoginController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String username, String password) throws SQLException {
        try {
            return usuarioDAO.autenticarUsuario(username, password);
        } catch (ExceptionDAO e) {
            System.out.println("Erro ao autenticar usuário: " + e.getMessage());
            return false;
        }
    }
}



