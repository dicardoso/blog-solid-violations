package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;
import br.edu.ifpb.padroes.modelo.PostagemDAO;

import java.util.Date;

public class PostagemServiceImpl implements PostagemService {

    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");

    @Override
    public void adicionarPostagem(Postagem postagem) {
        postagemDAO.addPostagemPublica(postagem)
    }

    @Override
    public void removerPostagem(Postagem postagem) {
        this.postagemDAO.deletePostagem(postagem);
    }

    @Override
    public void atualizarPostagem(Postagem postagem) {
        this.postagemDAO.updatePostagem(postagem);
    }

    @Override
    public void adicionarResposta(Postagem postagem, Postagem resposta) {
        postagemDAO.addPostagemResposta(postagem);
    }

}
