package dev.wakandaacademy.gestaofuncionario.funcionario.application.service;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioCriadoResponse;
import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioNovoRequest;

public interface FuncionarioService {
    FuncionarioCriadoResponse criaNovoFuncionario(FuncionarioNovoRequest funcionarioNovo);
}
