package com.example.cliente.controllers;

import com.example.cliente.models.ClienteModel;
import com.example.cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ClienteModel salvar(@RequestBody ClienteModel cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public List<ClienteModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ClienteModel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}