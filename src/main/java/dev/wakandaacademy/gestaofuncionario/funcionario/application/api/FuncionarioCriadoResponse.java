package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;
import lombok.Value;

import java.util.UUID;

@Value
public class FuncionarioCriadoResponse {
    private final UUID idFuncionario;
    private final String nomeCompleto;
    private final String cargo;
    private final Integer salario;
    private final String telefone;
    private final String endereco;

    public FuncionarioCriadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.cargo = funcionario.getCargo();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
    }

}
