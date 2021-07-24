package br.edu.ifpb.padroes.dao;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public abstract class PostagemDAO {

    protected abstract Connection connect();

    public abstract void addPostagem(Postagem postagem);
    public abstract void addPostagemResposta(Postagem postagem);
    public abstract void updatePostagem(Postagem postagem);
    public abstract void deletePostagem(Postagem postagem);
    public abstract List<Postagem> listPostagens();
    public abstract Postagem getPostagem(Long id);

    public void trataExcecao(Exception ex) {
        Logger.getLogger(UsuarioServiceImpl.class.getName()).warning(ex.getMessage());
    }

}
