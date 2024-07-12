package com.nascimento.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assumptions.assumeFalse("nascimento.pereira".equals(System.getenv("USER")));
        Assertions.assertEquals(2,1 + 1);
    }
}
