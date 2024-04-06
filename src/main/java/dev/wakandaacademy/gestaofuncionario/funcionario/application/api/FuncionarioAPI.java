package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/funcionarios")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioCriadoResponse postNovoFuncionario(@RequestBody @Valid FuncionarioNovoRequest funcionarioNovo);

    @GetMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    FuncionarioCriadoResponse buscaFuncionarioPorId(@PathVariable UUID idFuncionario);
}
