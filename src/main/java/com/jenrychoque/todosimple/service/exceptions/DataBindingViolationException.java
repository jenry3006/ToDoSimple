package com.jenrychoque.todosimple.service.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class DataBindingViolationException extends DataIntegrityViolationException {

        public DataBindingViolationException(String message){
            super(message);
        }
    }
