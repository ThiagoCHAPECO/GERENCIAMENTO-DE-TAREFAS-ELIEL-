package com.gerenciamento.tarefa.services;

import com.gerenciamento.tarefa.models.TarefaModel;
import com.gerenciamento.tarefa.respositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<TarefaModel> findAll(){
        return tarefaRepository.findAll();
    }

    public Optional<TarefaModel> findById(Long id){
        return tarefaRepository.findById(id);
    }

    public void delete(Long id){
        tarefaRepository.deleteById(id);
    }

    public TarefaModel save(TarefaModel tarefaModel){
        return tarefaRepository.save(tarefaModel);
    }
}
