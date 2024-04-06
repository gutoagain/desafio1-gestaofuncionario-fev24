package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Value
public class FuncionarioNovoRequest {
    @NotBlank
    @Size(message = "Campo nome não pode estar vazio", max = 100, min = 3)
    private String nomeCompleto;
    private final String cargo;
    private final Integer salario;
    @NotBlank
    @Size(message = "O telefone deve ter no máximo 15 caracteres", max = 15)
    @Pattern(regexp = "\\+?\\d{1,15}", message = "Telefone inválido")
    private String telefone;
    private final String endereco;
}
