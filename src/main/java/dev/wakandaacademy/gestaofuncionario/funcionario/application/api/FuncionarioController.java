package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

    @Override
    public FuncionarioCriadoResponse buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - buscaFuncionarioPorId");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioCriadoResponse buscaFuncionario = funcionarioAppplicationService
                .buscaFuncionarioPorId(idFuncionario);
        log.info("[finaliza] FuncionarioController - buscaFuncionarioPorId");
        return buscaFuncionario;
    }

    @Override
    public void editaFuncionario(UUID idFuncionario, FuncionarioEditaRequest funcionarioEdita) {
        log.info("[inicia] FuncionarioController - editaFuncionario");
        funcionarioAppplicationService.editaFuncionario(idFuncionario, funcionarioEdita);
        log.info("[finaliza] FuncionarioController - editaFuncionario");
    }

    @Override
    public void excluiFuncionario(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - excluiFuncionario");
        funcionarioAppplicationService.excluiFuncionario(idFuncionario);
        log.info("[finaliza] FuncionarioController - excluiFuncionario");
    }
}
