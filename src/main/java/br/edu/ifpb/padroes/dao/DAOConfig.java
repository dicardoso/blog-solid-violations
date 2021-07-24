package br.edu.ifpb.padroes.dao;

public class DAOConfig {
    private String arquivoBanco;

    public DAOConfig(String arquivoBanco) {
        this.arquivoBanco = arquivoBanco;
    }

    Connection openConnection() {
        return DriverManager.getConnection("jdbc:sqlite:"+this.arquivoBanco)
    }
}