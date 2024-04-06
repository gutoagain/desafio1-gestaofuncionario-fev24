package dev.wakandaacademy.gestaofuncionario.funcionario.infra;

import dev.wakandaacademy.gestaofuncionario.funcionario.domain.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioMongoRepository extends MongoRepository<Funcionario, UUID> {
    Optional<Funcionario> findByIdFuncionario(UUID idFuncionario);
}
