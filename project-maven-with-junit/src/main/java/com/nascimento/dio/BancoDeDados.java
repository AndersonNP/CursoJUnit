package com.nascimento.dio;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("inseriu dados");
    }

    public static void remeveDados(Pessoa pessoa){
        LOGGER.info("removeu dados");
    }
}
