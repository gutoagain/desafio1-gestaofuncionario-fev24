package dev.wakandaacademy.gestaofuncionario.funcionario.infra;

import dev.wakandaacademy.gestaofuncionario.funcionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
