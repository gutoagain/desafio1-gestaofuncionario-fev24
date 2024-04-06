package dev.wakandaacademy.gestaofuncionario.funcionario.infra;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;
import dev.wakandaacademy.gestaofuncionario.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class FuncionarioRepositoryMongoDB implements FuncionarioRepository {
    private final FuncionarioMongoRepository funcionarioMongoRepository;

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioRepositoryMongoDB - salva");
        Funcionario novoFuncionario = funcionarioMongoRepository.save(funcionario);
        log.info("[finaliza] FuncionarioRepositoryMongoDB - salva");
        return novoFuncionario;
    }

    @Override
    public Funcionario buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioRepositoryMongoDB - buscaFuncionarioPorId");
        Funcionario funcionario = funcionarioMongoRepository.findByIdFuncionario(idFuncionario)
                .orElseThrow(() -> APIException
                        .build(HttpStatus.NOT_FOUND, "Funcionario não encontrado!"));
        log.info("[finaliza] FuncionarioRepositoryMongoDB - buscaFuncionarioPorId");
        return funcionario;
    }

    @Override
    public void exclui(Funcionario funcionario) {
        log.info("[inicia] FuncionarioRepositoryMongoDB - exclui");
        funcionarioMongoRepository.delete(funcionario);
        log.info("[finaliza] FuncionarioRepositoryMongoDB - exclui");
    }
}
