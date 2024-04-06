package dev.wakandaacademy.gestaofuncionario.funcionario.application.service;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioCriadoResponse;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioEditaRequest;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioNovoRequest;

import java.util.UUID;

public interface FuncionarioService {
    FuncionarioCriadoResponse criaNovoFuncionario(FuncionarioNovoRequest funcionarioNovo);
    FuncionarioCriadoResponse buscaFuncionarioPorId(UUID idFuncionario);
    void editaFuncionario(UUID idFuncionario, FuncionarioEditaRequest funcionarioEdita);

    void excluiFuncionario(UUID idFuncionario);
}
