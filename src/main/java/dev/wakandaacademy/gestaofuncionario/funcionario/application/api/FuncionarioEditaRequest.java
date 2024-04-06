package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class FuncionarioEditaRequest {
    @NotBlank
    @Size(message = "Campo nome não pode estar vazio", max = 100, min = 3)
    private String nomeCompleto;
    private final String cargo;
    private final Integer salario;
    @NotBlank
    @Size(message = "O telefone deve ter no máximo 15 caracteres", max = 15)
    private String telefone;
    private final String endereco;
}
