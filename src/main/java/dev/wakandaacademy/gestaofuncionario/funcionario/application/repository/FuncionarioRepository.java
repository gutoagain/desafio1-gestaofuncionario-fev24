package dev.wakandaacademy.gestaofuncionario.funcionario.application.repository;

import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;

import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    Funcionario buscaFuncionarioPorId(UUID idFuncionario);
    void exclui(Funcionario funcionario);
}
