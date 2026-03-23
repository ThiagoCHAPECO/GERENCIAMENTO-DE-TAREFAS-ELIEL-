package com.gerenciamento.tarefa.respositories;

import com.gerenciamento.tarefa.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}
