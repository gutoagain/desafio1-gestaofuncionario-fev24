package dev.wakandaacademy.gestaofuncionario.funcionario.application.service;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioCriadoResponse;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioEditaRequest;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioNovoRequest;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioCriadoResponse criaNovoFuncionario(@Valid FuncionarioNovoRequest funcionarioNovo) {
        log.info("[inicia] FuncionarioApplicationService - criaNovoFuncionario");
        var funcionario = new Funcionario(funcionarioNovo);
        funcionarioRepository.salva(funcionario);
        log.info("[finaliza] FuncionarioApplicationService - criaNovoFuncionario");
        return new FuncionarioCriadoResponse(funcionario);
    }

    @Override
    public FuncionarioCriadoResponse buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioApplicationService - buscaFuncionarioPorId");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioPorId(idFuncionario);
        log.info("[finaliza] FuncionarioApplicationService - buscaFuncionarioPorId");
        return new FuncionarioCriadoResponse(funcionario);
    }

    @Override
    public void editaFuncionario(UUID idFuncionario, FuncionarioEditaRequest funcionarioEdita) {
        log.info("[inicia] FuncionarioApplicationService - editaFuncionario");
        log.info("[finaliza] FuncionarioApplicationService - editaFuncionario");
    }
}
