package br.edu.ifpb.padroes.dao;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public abstract class UsuarioDAO {

    protected abstract Connection connect();
    public abstract void addUsuario(Usuario usuario);
    public abstract void updateUsuario(Usuario usuario);
    public abstract void deleteUsuario(Usuario usuario);
    public abstract List<Usuario> listUsuarios();
    public abstract Usuario getUsuario(Long id);
    public void trataExcecao(Exception ex) {
        Logger.getLogger(UsuarioServiceImpl.class.getName()).warning(ex.getMessage());
    }


}
