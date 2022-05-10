package com.example.patterns.padroes.service.impl;

import com.example.patterns.padroes.model.Cliente;
import com.example.patterns.padroes.model.ClienteRepository;
import com.example.patterns.padroes.model.EnderecoRepository;
import com.example.patterns.padroes.service.ClienteService;
import com.example.patterns.padroes.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;



    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
