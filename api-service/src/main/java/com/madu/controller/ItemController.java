package com.madu.controller;

import com.madu.adapter.ItemAdapter;
import com.madu.exception.BadRequestException;
import org.openapitools.api.ItemApi;
import org.openapitools.model.BadRequest;
import org.openapitools.model.Item;
import org.openapitools.model.ItemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class ItemController implements ItemApi {

    @Autowired
    private ItemAdapter itemAdapter;

    @Override
    public ResponseEntity<ItemInfo> addItem(Item item) {
        return new ResponseEntity<>(itemAdapter.addItem(item), HttpStatus.CREATED);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequest> handleBadRequest(BadRequestException exception) {
        return new ResponseEntity<>(new BadRequest().message(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
