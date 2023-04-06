package com.madu.controller;

import org.openapitools.api.ClientesApiDelegate;
import org.openapitools.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteController implements ClientesApiDelegate {

    @Override
    public ResponseEntity<Cliente> addCliente(Cliente cliente) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteClienteById(Integer id) {
        return null;    }

    @Override
    public ResponseEntity<Cliente> getClienteById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Cliente>> getClientes() {
        return null;
    }

    @Override
    public ResponseEntity<Cliente> updateClienteById(Integer id, Cliente cliente) {
        return null;
    }
}
