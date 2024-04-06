package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
    private final FuncionarioService funcionarioAppplicationService;

    @Override
    public FuncionarioCriadoResponse postNovoFuncionario(FuncionarioNovoRequest funcionarioNovo) {
        log.info("[inicia] FuncionarioController - postNovoFuncionario");
        FuncionarioCriadoResponse funcionarioCriado = funcionarioAppplicationService
                .criaNovoFuncionario(funcionarioNovo);
        log.info("[finaliza] FuncionarioController - postNovoFuncionario");
        return funcionarioCriado;
    }
}
