package dev.wakandaacademy.gestaofuncionario.funcionario.application.repository;

import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
}
