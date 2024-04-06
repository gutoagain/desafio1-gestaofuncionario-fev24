package dev.wakandaacademy.gestaofuncionario.funcionario.application.service;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioCriadoResponse;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioNovoRequest;
import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    @Override
    public FuncionarioCriadoResponse criaNovoFuncionario(FuncionarioNovoRequest funcionarioNovo) {
        log.info("[inicia] FuncionarioApplicationService - criaNovoFuncionario");
        log.info("[finaliza] FuncionarioApplicationService - criaNovoFuncionario");
        return null;
    }
}
