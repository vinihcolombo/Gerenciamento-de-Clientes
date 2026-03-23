package com.example.cliente.services;

import com.example.cliente.models.ClienteModel;
import com.example.cliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ClienteModel salvar(ClienteModel cliente) {
        return repository.save(cliente);
    }

    public List<ClienteModel> listar() {
        return repository.findAll();
    }

    public ClienteModel buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}