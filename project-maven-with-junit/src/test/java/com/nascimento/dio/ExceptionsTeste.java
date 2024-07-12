package com.nascimento.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0.0);
        Conta contaDestino = new Conta("456789", 0.0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1);
        });

        Assertions.assertDoesNotThrow(() ->{
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, 1);
        });
    }
}
