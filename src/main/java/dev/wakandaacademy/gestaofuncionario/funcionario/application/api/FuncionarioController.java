package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
    @Override
    public FuncionarioCriadoResponse postNovoFuncionario(FuncionarioNovoRequest request) {
        log.info("[inicia] FuncionarioController - postNovoFuncionario");
        log.info("[finaliza] FuncionarioController - postNovoFuncionario");
        return null;
    }
}
