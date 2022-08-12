package com.backalkemi.peliculas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RespuestaNoEncontrado extends RuntimeException {

        private static final long serialVersionUID=1L;

        public RespuestaNoEncontrado(String mensaje){
            super(mensaje);
        }

    }
