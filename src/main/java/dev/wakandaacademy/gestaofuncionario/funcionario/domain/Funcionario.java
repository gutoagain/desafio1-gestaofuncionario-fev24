package dev.wakandaacademy.gestaofuncionario.funcionario.domain;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.api.FuncionarioNovoRequest;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Document(collection = "Funcionario")
@Log4j2
public class Funcionario {
    @Id
    private UUID idFuncionario;
    @NotNull
    @NotBlank
    private String nomeCompleto;
    private String cargo;
    @NotBlank
    private Integer salario;
    private String telefone;
    private String endereco;

    public Funcionario(FuncionarioNovoRequest funcionarioNovo) {
        this.idFuncionario = UUID.randomUUID();
        this.nomeCompleto = funcionarioNovo.getNomeCompleto();
        this.cargo = funcionarioNovo.getCargo();
        this.salario = funcionarioNovo.getSalario();
        this.telefone = funcionarioNovo.getTelefone();
        this.endereco = funcionarioNovo.getEndereco();
    }

}
