package com.madu.controller;

import com.madu.adapter.CustomerAdapter;
import com.madu.exception.BadRequestException;
import org.openapitools.api.ClientesApi;
import org.openapitools.model.BadRequest;
import org.openapitools.model.Cliente;
import org.openapitools.model.ClienteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@Component
public class ClientController implements ClientesApi {

    @Autowired
    private CustomerAdapter clientAdapter;

    @Override
    public ResponseEntity<ClienteInfo> addCliente(Cliente cliente) {
        return new ResponseEntity<>(clientAdapter.addCustomer(cliente), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteClienteById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<ClienteInfo> getClienteById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<ClienteInfo>> getClientes() {
        return null;
    }

    @Override
    public ResponseEntity<ClienteInfo> updateClienteById(Integer id, Cliente cliente) {
        return null;
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequest> handleBadRequest(BadRequestException exception) {
        return new ResponseEntity<>(new BadRequest().message(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
