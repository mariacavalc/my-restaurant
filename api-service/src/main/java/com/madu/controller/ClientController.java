package com.madu.controller;

import com.madu.adapter.CustomerAdapter;
import org.openapitools.api.ClientesApiDelegate;
import org.openapitools.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientController implements ClientesApiDelegate {

    @Autowired
    private CustomerAdapter clientAdapter;

    @Override
    public ResponseEntity<Cliente> addCliente(Cliente cliente) {
        return new ResponseEntity<>(clientAdapter.addCustomer(cliente), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteClienteById(Integer id) {
        return null;
    }

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
