package dev.wakandaacademy.gestaofuncionario.funcionario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value = "/public/v1/funcionario")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioCriadoResponse postNovoFuncionario(@RequestBody @Valid FuncionarioNovoRequest funcionarioNovo);

    @GetMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    FuncionarioCriadoResponse buscaFuncionarioPorId(@PathVariable UUID idFuncionario);

    @PatchMapping("editaFuncionario/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void editaFuncionario(@PathVariable UUID idFuncionario,
                          @RequestBody @Valid FuncionarioEditaRequest funcionarioEdita);

    @DeleteMapping("excluiFuncionario/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void excluiFuncionario(@PathVariable UUID idFuncionario);
}
